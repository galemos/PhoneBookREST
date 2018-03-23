package io.github.gablemos.phonebook.ui.controller;

import io.github.gablemos.phonebook.ui.domain.Person;
import io.github.gablemos.phonebook.ui.domain.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("phonebook")
public class PhoneBookController {

    private final PhoneBook phoneBook;

    @Autowired
    public PhoneBookController(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    @PostMapping
    public ResponseEntity<?> addNewProduct(@RequestBody Person person){
        phoneBook.addPerson(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> showAllProducts(){
        return new ResponseEntity<>(phoneBook.getPersonList(), HttpStatus.OK);
    }
}