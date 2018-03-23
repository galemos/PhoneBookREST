package io.github.gablemos.phonebook.ui.controller;

import io.github.gablemos.phonebook.infra.wrapper.PersonWrapper;
import io.github.gablemos.phonebook.domain.PhoneBook;
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
    public ResponseEntity<?> addNewProduct(@RequestBody final PersonWrapper wrapper){
        phoneBook.addPerson(wrapper.getPerson());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> showAllProducts(){
        return new ResponseEntity<>(phoneBook.getPersonList(), HttpStatus.OK);
    }
}
