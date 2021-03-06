package ingraph.debugger.backend.serializer;

import java.io.IOException;

import org.neo4j.driver.v1.Value;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ValueSerializer extends JsonSerializer<Value> {

	@Override
	public void serialize(Value value, JsonGenerator gen, SerializerProvider serializers)
		throws IOException, JsonProcessingException {
		gen.writeStartObject();
		for (String key : value.keys()) {
			gen.writeObjectField(key, value.get(key).asObject());
		}
		gen.writeEndObject();
	}

}
