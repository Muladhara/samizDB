import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.mongodb.util.JSON;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.apache.commons.lang3.SerializationUtils;
import org.json.simple.JSONObject;
import parser.VTLLexer;
import parser.VTLParser;
import py4j.GatewayServer;
import runtime.*;
import runtime.mathematicalOperators.SumScalarOperator;

import java.io.*;
import java.net.ServerSocket;
import java.nio.file.*;

/**
 * Created by roberto on 05/04/16.
 */
public class WebMain {

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new WebMain());
        gatewayServer.start();
    }

    public String execute(String expression, String sessionId) throws IOException {
        /*Create a temporary file where the console messages will be written on*/
        String tmp = "temp";
        File temp = File.createTempFile(tmp,".json");
        try {
            System.setOut(new PrintStream(temp));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*Create the Obects needed*/
        Environment e = new Environment();


        String tempFolder = System.getProperty("java.io.tmpdir");
        String clientPath = tempFolder+"/"+sessionId+".json";
        File clientEnv = new File(clientPath);


        /*Load the environment functions from the file associated with the sessionID*/
        if(clientEnv.exists() && !clientEnv.isDirectory()){
            ObjectMapper mapper = new ObjectMapper();
            SimpleModule customDeSerializerModule = new SimpleModule();
            customDeSerializerModule.addDeserializer(Environment.class, new EnvironmentDeserializer());
            mapper.registerModule(customDeSerializerModule);
            e = mapper.readValue(clientEnv, Environment.class);
            /*
            for(String s : e.getResultFunctions().keySet()){
                System.out.println("stiam in e: " + s);
            }
            */
        }

        StatementExecutor se = new StatementExecutor(e);
        se.executeStatementFromString(expression);

        /*Serialize the environment in a file*/
        if(!e.getResultFunctions().isEmpty()){
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            SimpleModule customSerializerModule = new SimpleModule();
            customSerializerModule.addSerializer(Environment.class, new EnvironmentSerialization());
            mapper.registerModule(customSerializerModule);
            mapper.writeValue(new File(clientPath), e);
        }


        String everything = "";
        BufferedReader br = new BufferedReader(new FileReader(temp));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }

        try{
            temp.delete();
        }catch(Exception r){
            r.printStackTrace();
        }

        return everything;
    }

}

