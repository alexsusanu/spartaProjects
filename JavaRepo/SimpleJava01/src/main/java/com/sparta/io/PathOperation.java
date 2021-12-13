package com.sparta.io;

import java.io.File;
import java.io.IOException;

public class PathOperation {
    public static void tryPathOps(){
        File file = new File("test.file");
        if(!file.exists()){
            try {
                boolean success = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File created");
            File dir = new File("testdir");
            dir.mkdir();
        }
    }
}
