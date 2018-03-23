package io.github.gablemos.phonebook.infra.service;

import com.fasterxml.jackson.databind.module.SimpleModule;
import io.github.gablemos.phonebook.infra.wrapper.PersonWrapper;
import io.github.gablemos.phonebook.ui.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class DeserializerMapper extends SimpleModule {

    public DeserializerMapper() {
        this.addDeserializer(Person.class, new PersonWrapper());
    }
}
