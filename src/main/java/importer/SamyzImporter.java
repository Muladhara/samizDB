package importer;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;

import console.ConsoleManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.ComponentRole;
import model.ComponentType;
import model.DataPoint;
import model.Dataset;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Roberto on 24/02/2016.
 */

public class SamyzImporter {

    public static URL getURL(String urlString){
        URL url = null;
        try {
            url = new URL(urlString.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static HttpURLConnection getConnection(URL url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static BufferedReader getBuffer(HttpURLConnection connection) throws GenericException {
        BufferedReader read = null;
        try{
            InputStreamReader input = new InputStreamReader(connection.getInputStream());
            read = new BufferedReader(input);
        }catch(Exception e){
            throw new GenericException("Cannot read from the specified source");
        }

        return read;

    }

    public static String getHTML(BufferedReader read){
        String html = "";
        String line = null;
        try {
             line = read.readLine();
            while(line!=null) {
                html += line;
                try {
                    line = read.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        html = html.substring(10);
        return html;
    }

    public static Dataset createDB(String html, String inserted) throws IOException, org.json.simple.parser.ParseException {
        TreeMap<String,String> obj = new TreeMap<String,String>();
        JSONObject obj2 = new JSONObject();
        Boolean graphSegnalator = true;
        String attr = "";String value = "";

        inserted = inserted.replace("http://", "");
        inserted = inserted.replace("/","-");

        String tmp = "temp";
        File temp = File.createTempFile(tmp,".json");
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

        bw.write("{\"data\": [");
        for (String separatedByGraph: html.split("}, ")) {
            for (String separatedByComa : separatedByGraph.split(",")) {
                String[] separatedByDoublePoint = separatedByComa.split(":");
                attr = separatedByDoublePoint[0];
                value = separatedByDoublePoint[1];
                attr = attr.trim();
                value = value.trim();
                if (graphSegnalator) {
                    Pattern p = Pattern.compile("[{]", Pattern.CASE_INSENSITIVE);
                    Matcher matchAttr = p.matcher(attr);
                    if (matchAttr.find()) {
                        attr = attr.substring(1);
                    }
                    graphSegnalator = false;
                }
                if(!graphSegnalator) {
                    Pattern p = Pattern.compile("[}]", Pattern.CASE_INSENSITIVE);
                    Matcher matchValue = p.matcher(value);
                    if (matchValue.find()) {
                        Pattern p2 = Pattern.compile("[\\}\\]\\}]");
                        matchValue = p2.matcher(value);
                        if(matchValue.find()){
                            value = value.substring(0, value.length()-3);
                        }
                        graphSegnalator = true;
                    }
                }
                attr = attr.substring(1,attr.length()-1);
                value = value.substring(1, value.length()-1);
                obj.put(attr,value);
            }
            obj2.putAll(obj);
            bw.write(obj2.toJSONString() + "," + "\n");
            bw.flush();
        }
        bw.write("]}");
        bw.close();

        return addToLocalDB(inserted, temp);
    }

    public static Dataset insertDataPoints(Dataset ds, BufferedReader br, File temp) throws IOException, ParseException {
        if(br==null)
            return null;
        DataPoint dataPoint = null;
        ComponentRole id = ComponentRole.IDENTIFIER;
        ComponentRole measure = ComponentRole.MEASURE;

        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject)parser.parse(br);
//        JSONObject obj = (JSONObject) parser.parse(new String(Files.readAllBytes(Paths.get("/tmp/html.json"))));
        JSONArray data = (JSONArray)obj.get("data");
        Iterator<JSONObject> iterator = data.iterator();

        while(iterator.hasNext()){
            dataPoint = new DataPoint();
            JSONObject instance = iterator.next();
            String date = (String)instance.get("date");
            String tr = (String)instance.get("tr");
            String realStart = (String)instance.get("realtime_start");
            String realEnd = (String)instance.get("realtime_end");
            String value = (String)instance.get("value");
            dataPoint.createComponentByNameTypeRole("date", ComponentType.STRING, id);
            dataPoint.addVTLValueFromString("date", date);
            dataPoint.createComponentByNameTypeRole("realtime_start", ComponentType.STRING, id);
            dataPoint.addVTLValueFromString("realtime_start", realStart);
            dataPoint.createComponentByNameTypeRole("realtime_end", ComponentType.STRING, id);
            dataPoint.addVTLValueFromString("realtime_end", realEnd);
            dataPoint.createComponentByNameTypeRole("tr", ComponentType.STRING, id);
            dataPoint.addVTLValueFromString("tr", tr);
            dataPoint.createComponentByNameTypeRole("value", ComponentType.DOUBLE, measure);;
            dataPoint.addVTLValueFromString("value", value);
            ds.addDataPoint(dataPoint);
        }
        br.close();

        if(temp!=null){
            try{
                temp.delete();
            }catch(Exception r){
                r.printStackTrace();
            }
        }

        return ds;
    }

    public static Dataset addToLocalDB(String inserted) throws IOException, org.json.simple.parser.ParseException, GenericException {
        Dataset ds = new Dataset(inserted);
        String path = inserted;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
        }catch(Exception e){
            throw new GenericException("Cannot read from the specified source");
        }

        return insertDataPoints(ds,br, null);

    }


    public static Dataset addToLocalDB(String inserted, File temp) throws IOException, org.json.simple.parser.ParseException {
        inserted = inserted.replace("/","-");
        Dataset ds = new Dataset(inserted);
        BufferedReader br = new BufferedReader(new FileReader(temp));
        return insertDataPoints(ds,br, temp);
    }

    public static Dataset addToLocalDB2(String html, String inserted) throws ParseException, IOException {
        PrintWriter out = new PrintWriter( "/tmp/html.json" );
        out.println( html );
        Dataset ds = new Dataset(inserted);
        File f = new File("/tmp/html.json");
        RandomAccessFile ra = new RandomAccessFile(f, "rw");
        ra.seek(0);
        ra.write("{\"data\": [".getBytes());
        ra.seek(ra.length());
        ra.write("]}".getBytes());
        ra.close();
        //BufferedWriter bw =  new BufferedWriter(new FileWriter(f));
        //System.out.println(f.toString() +"  "+ f);
        BufferedReader br = new BufferedReader(new FileReader(f));
        return insertDataPoints(ds,br, f);
    }

    public static Dataset createDBfromURL(String urlString) throws IOException, org.json.simple.parser.ParseException {
        URL url = getURL(urlString);
            if(url == null){
                ConsoleManager.printMessage("URL unvalid");
                return null;
            }
        HttpURLConnection connection = getConnection(url);
        if(connection == null){
            ConsoleManager.printMessage("Connection failed");
            return null;
        }
        BufferedReader read = null;
        try {
            read = getBuffer(connection);
        } catch (GenericException genericException) {
            ConsoleManager.printMessage("Cannot read from the specified source");
        }
        if(read == null){
            return null;
        }
        String html = getHTML(read);
        //return addToLocalDB2(html, urlString);
        return createDB(html,urlString);
    }

}
