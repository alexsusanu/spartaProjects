package com.sparta.designpatterndb;

import java.util.List;

/**
 * accessing data using objects
 * Person is a table in db
 * DAO methods are sql functions
 */
public interface PersonDAO {
    List<Person> getAll();
    boolean insertPerson(Person p);
    boolean deletePerson(Person p);
}
