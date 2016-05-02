package runtime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by roberto on 12/04/16.
 */
public class EnvironmentSerialization extends JsonSerializer<Environment> {
    @Override
    public void serialize(Environment environment, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart("resultFunctions");
        int i = 0;
        for(String id : environment.getResultFunctions().keySet()){
            jsonGenerator.writeStringField(id+String.valueOf(i), environment.getResultfunction(id).getClass().toString().substring(6));
            jsonGenerator.writeStringField(id, environment.getResultfunction(id).toString());
            i++;
        }
        jsonGenerator.writeEndObject();
        /*
        jsonGenerator.writeObjectFieldStart("operands");
        for(String op : environment.getOperands()){
            jsonGenerator.writeStringField("1",op);
        }
        jsonGenerator.writeEndObject();
        */

        /*fare il custom serializer per ogni campo di environment, result functions lo prendeva male quello nativo. Se necessario anche il deserializer*/
    }
}
