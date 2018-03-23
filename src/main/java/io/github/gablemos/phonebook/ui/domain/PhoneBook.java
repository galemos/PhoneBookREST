package io.github.gablemos.phonebook.ui.domain;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class PhoneBook {

    private final List<Person> personList;

    public PhoneBook() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return Collections.unmodifiableList(personList);
    }
}
