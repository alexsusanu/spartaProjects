package com.sparta.exceptions;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;

public class ExceptionsDemo {
    public static void main(String[] args) throws SpartaException{
        someMethod();
        try {
            anotherMethodWithThrows();
        } catch (ParseException e) {
            throw new SpartaException(e);
        }
    }

    public static void someMethod(){
        int i = 12;
        int j = 0;
//        ArrayList<Integer> theList = new ArrayList<>();
//        while(true){
//            theList.add(123); //out of memory error. implement catch OutOfMemory
//        }
//        try{
//           int k = i / j;
//        }catch(ArithmeticException e){
//           e.printStackTrace();
//           System.out.println("reached catch block");
//           System.out.println(e.getLocalizedMessage());
//        }
    }

    public static void anotherMethod(){
        Date today = null;
        DateFormat dateFormat = new SimpleDateFormat();
        try{
            today = dateFormat.parse("30/11/2021");
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(today);
    }

    public static void anotherMethodWithThrows() throws ParseException{
        Date today = null;
        DateFormat dateFormat = new SimpleDateFormat();
        today = dateFormat.parse("30/11/2021");
        System.out.println(today);
    }
}
