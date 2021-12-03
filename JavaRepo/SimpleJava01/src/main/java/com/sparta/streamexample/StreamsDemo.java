package com.sparta.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("mike", "ed", "mark", "george", "talal", "ignas", "ria"));
        // for loop, no streams
//        for(String s : myList){
//            System.out.println(s);
//        }
//        myList.stream().forEach(new Consumer<String>(){
//            public void accept(String s){
//                System.out.println(s);
//            }
//        });

        // lambdas
//        myList.stream().filter(s -> s.length() < 4).forEach(s -> System.out.println(s));

       // using method reference
//        myList.stream().forEach(System.out::println);

//        String combinedName = myList.stream().filter(s -> s.length() <= 4).reduce((s1, s2) -> s1 + s2).get();
//        System.out.println(combinedName);
//        System.out.println(myList.stream().allMatch(s -> s.length() > 1));
//        System.out.println(myList.stream().anyMatch(s -> s.length() > 9));
        int totalChars = myList.stream()
                .reduce(new Integer(0), (s1, s2) -> s1 + s2.length(),
                                              (l1,l2) -> l1 + l2);
        System.out.println(totalChars);
    }
}
