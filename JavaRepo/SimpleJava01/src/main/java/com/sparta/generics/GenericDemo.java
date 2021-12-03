package com.sparta.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {

        List<Person> myList = new ArrayList();
        myList.add(new Person("Talal", "Thaheem"));
        myList.add(new Person("George", "Edwards"));
        System.out.println(myList);
        System.out.println(((Person)myList.get(0)).getName());

        Container<String> stringContainer = new Container<>();
        stringContainer.storeInstance("hello");
        System.out.println(stringContainer.retrieveInstance());

        Container<Person> personContainer = new Container<>();
        personContainer.storeInstance(new Person("Mark", "Burnitt"));
        System.out.println(personContainer.retrieveInstance());

        Collections.sort(myList);
        System.out.println(myList);
    }
}
