package com.sparta.designpatterndb;

import java.util.List;

public class PersonDAOImpl implements PersonDAO{
    @Override
    public List<Person> getAll() {
        // select * from Person table
        return null;
    }

    @Override
    public boolean insertPerson(Person p) {
        // insert into Person, values(name, age)
        return false;
    }

    @Override
    public boolean deletePerson(Person p) {
        // delete from Person where p.id == x
        return false;
    }
}
