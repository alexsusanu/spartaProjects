package com.sparta.threadexample;

import java.util.ArrayList;
import java.util.Random;

public class MyRunnableClass implements Runnable{
    private ArrayList<String> theSharedList;
    private String theName;

    public void addString(){
        theSharedList.add(theName);
    }

    @Override
    public void run() {
        System.out.println("In run() for " + theName);
        addString();
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finishing run() " + theName);
    }

    public ArrayList<String> getTheSharedList() {
        return theSharedList;
    }

    public void setTheSharedList(ArrayList<String> theSharedList) {
        this.theSharedList = theSharedList;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }
}
