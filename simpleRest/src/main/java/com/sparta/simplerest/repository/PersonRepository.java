package com.sparta.simplerest.repository;

import com.sparta.simplerest.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private List<Person> personList = new ArrayList<>();

    public PersonRepository setPersonList(List<Person> personList) {
        this.personList = personList;
        return this;
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public Optional<Person> getById(int id){
        return personList.stream().filter(p -> p.getId() == id).findAny();
    }

    public Person deletePerson(int id) {
        return personList.remove(id);
    }
}
