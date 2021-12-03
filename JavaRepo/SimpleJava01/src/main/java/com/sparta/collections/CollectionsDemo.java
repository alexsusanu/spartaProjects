package com.sparta.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
       Set<String> mySet = new TreeSet<>(Set.of("Anthony", "Yefri", "George", "Kamil", "Talal", "Alex",
                "Konrad", "Pruthvi", "Nikolaos", "Ishmael", "Jakub", "Mihai", "Ed",
                "Mark", "Ignas", "Leo", "Ria"));

        /*
         * ArrayList with List Interface example
         */
//        System.out.println(myList.getClass().getName());
//        System.out.println(myList.get(14)); //get name in position 14
//        myList.add(10,"Nish"); //move elements from 10 onwards by one position to make room for new
//        System.out.println(myList.contains("Leo")); // returns boolean
//        System.out.println(myList.indexOf("Leo")); // 16
//        myList.remove("Kamil");
//        System.out.println(myList.indexOf("Leo")); // 15

        /*
         * HashSet with Set Interface example. NOT sorted
         */
//        mySet.add("Nish");
//        mySet.remove("Kamil");
//        mySet.add("Nish"); // not added
//        System.out.println(mySet);
//        for(String s : mySet){
//            System.out.println(s);
//        }

        /*
         * TreeSet example. automatically sorted
         * TreeSet is the impl, SortedSet is the interface
         */
//        mySet.add("Nish");
//        mySet.remove("Kamil");
//        mySet.add("Nish"); // not added
//        System.out.println(mySet);
//        for(String s : mySet){
//            System.out.println(s);
//        }

        // to check Que and Deque

        /*
         * Map example
         */

        Map<String, Integer> myMap = new HashMap<>();
                myMap.putAll(Map.of("Anthony", 23, "Yefri",30, "George", 21, "Kamil", 32, "Talal", 32, "Alex", 43,
                "Konrad", 12, "Pruthvi", 56));
                myMap.putAll(Map.of("Nikolaos", 65, "Ishmael", 12, "Jakub", 43, "Mihai", 53, "Ed", 53,
                "Mark", 32, "Ignas", 43, "Leo", 43, "Ria", 20));

//        for(String name : myMap.keySet()){
//            System.out.println(name);
//        }
//
//        for(Map.Entry e: myMap.entrySet()){
//            System.out.println(e.getValue());
//        }

        Set<String> names = myMap.keySet();
        List<String> listOfNames = new ArrayList<>(List.copyOf(names));
        System.out.println(listOfNames);

//        Collections.sort(listOfNames);
//        Collections.reverse(listOfNames);
        Collections.shuffle(listOfNames);
        System.out.println(listOfNames);
    }
}
