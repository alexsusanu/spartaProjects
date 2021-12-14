package com.sparta.simplerest.controllers;

import com.sparta.simplerest.model.Person;
import com.sparta.simplerest.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    PersonRepository personRepository = new PersonRepository();
    List<Person> personList = new ArrayList<>();


    @PostMapping("/person/add")
    public Person addPerson(@RequestBody Person person){
        personRepository.setPersonList(personList);
        Person p = new Person(person.getId(), person.getFirstName(), person.getLastName());
        personList.add(p);
        return p;

    }

    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable int id){
        return personRepository.getById(id);
    }

    @DeleteMapping("/person/delete/{id}")
    public Person deletePersonById(@PathVariable int id){
        return personRepository.deletePerson(id);
    }
}
