package com.sparta.io;

import java.io.*;

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
        // try with resources
        // type of variable created must be auto closeable
        try (BufferedInputStream in
                     = new BufferedInputStream(new FileInputStream(binaryFile), 16384);
             BufferedOutputStream out
                     = new BufferedOutputStream(new FileOutputStream(outFile))){
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
