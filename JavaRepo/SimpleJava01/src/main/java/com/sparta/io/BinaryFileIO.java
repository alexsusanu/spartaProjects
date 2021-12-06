package com.sparta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileIO {
    public static void readBinaryFile(String binaryFile){
        FileInputStream in = null;
        try {
            in = new FileInputStream(binaryFile);
            int theByte;
            while ((theByte = in.read()) != -1) { //EOF
                System.out.print(Character.toChars(theByte));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void copyBinaryFile(String binaryFile, String outFile){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(binaryFile);
            out = new FileOutputStream(outFile);
            int theByte;
            while ((theByte = in.read()) != -1) { //EOF
                System.out.print(Character.toChars(theByte));
                out.write(theByte);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
