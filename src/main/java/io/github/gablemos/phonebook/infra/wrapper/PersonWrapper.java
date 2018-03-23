package io.github.gablemos.phonebook.infra.wrapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import io.github.gablemos.phonebook.ui.domain.Person;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PersonWrapper extends JsonDeserializer<Person>{

    @Override
    public Person deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode jsonNode = objectCodec.readTree(jsonParser);

        final String nome = jsonNode.get("name").asText();
        final String phone = jsonNode.get("phone").asText();

        return new Person(nome, phone);
    }
}
