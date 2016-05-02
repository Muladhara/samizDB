package runtime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import runtime.mathematicalOperators.SumScalarOperator;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/**
 * Created by roberto on 13/04/16.
 */
public class EnvironmentDeserializer extends JsonDeserializer<Environment> {

    @Override
    public Environment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        Environment e = new Environment();
        Iterator<JsonNode> it = node.elements();
        while(it.hasNext()) {
            JsonNode field = it.next();
            String[] s = field.toString().split(",");
            int i = 0;
            for (i = 0; i < s.length; i=i+2) {
                if (s[i].indexOf('{') == 0)
                    s[i] = s[i].substring(1);
                if (s[i].indexOf('}') == s[i].length() - 1)
                    s[i] = s[i].substring(0, s[i].length() - 1);

                String[] f = s[i].split(":");

                Class c = null;
                try {
                    c = Class.forName(f[1].substring(1, f[1].length() - 1));
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                f = s[i + 1].split(":");
                try {
                    Constructor<?>[] cons = c.getDeclaredConstructors();
                    for (Constructor constructor : cons) {
                        Class<?>[] params = constructor.getParameterTypes();
                        Object object = null;
                        if (params.length == 1) {
                            constructor = c.getConstructor(String.class);
                            /*per il GET*/
                            if(f.length > 2) {
                                if (f[2].indexOf('}') == f[2].length() - 1)
                                    f[2] = f[2].substring(0, f[2].length() - 1);
                                object = constructor.newInstance(f[1].substring(1) + ":" + f[2].substring(0, f[2].length() - 1));
                            }
                            else
                                object = constructor.newInstance(f[1].substring(1, f[1].length()-1));
                        } else if(params.length == 2) {
                            constructor = c.getConstructor(String.class, String.class);
                            String[] ps = f[1].split("&");
                            if(ps[1].indexOf('}')==ps[1].length()-1)
                                ps[1]=ps[1].substring(0,ps[1].length()-1);
                            object = constructor.newInstance(ps[0].substring(1),ps[1].substring(0,ps[1].length()-1));
                        } else{
                            constructor = c.getConstructor(String.class, String.class, String.class);
                            String[] ps = f[1].split("&");
                            if(ps[2].indexOf('}')==ps[2].length()-1)
                                ps[2]=ps[2].substring(0,ps[2].length()-1);
                            object = constructor.newInstance(ps[0].replaceAll("\"",""),ps[1].replaceAll("\"",""), ps[2].replaceAll("\"",""));
                        }

                        e.setResultFunction(f[0].substring(1,f[0].length()-1), (Function) object);
                    }
                } catch (NoSuchMethodException e1) {
                    e1.printStackTrace();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (InvocationTargetException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return e;
    }
}
