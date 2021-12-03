package com.sparta.streamexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileStreams {
    public static void main(String[] args) {
        try {
            List<String> emailList = Files
                    .lines(Path.of("SimpleJava01/canada.csv"))
                    .filter(s->s.split(",")[5].equals("ON"))
                    .map(s->s.split(",")[9])
                    .toList();
            System.out.println(emailList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getEmailList(){
        List<String> emailList = new ArrayList<>();
        try {
            emailList = Files
                    .lines(Path.of("SimpleJava01/canada.csv"))
                    .filter(s->s.split(",")[5].equals("ON"))
                    .map(s->s.split(",")[9])
                    .toList();
//            System.out.println(emailList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emailList;
    }
}
