package io.github.gablemos.phonebook.infra.wrapper;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.gablemos.phonebook.infra.serializer.PersonDeserializer;
import io.github.gablemos.phonebook.domain.Person;

@JsonDeserialize(using = PersonDeserializer.class)
public class PersonWrapper {

    private final Person person;

    public PersonWrapper(final Person person) {
        super();
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
