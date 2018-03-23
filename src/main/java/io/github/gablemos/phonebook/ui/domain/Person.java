package io.github.gablemos.phonebook.ui.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Person {

    private final String name;
    private final String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean startsWith(String letter){
        return letter.startsWith(name);
    }
}