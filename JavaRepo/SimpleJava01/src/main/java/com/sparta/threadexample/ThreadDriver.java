package com.sparta.threadexample;

import java.util.ArrayList;

public class ThreadDriver {
    public static void main(String[] args) {
        MyRunnableClass object1 = new MyRunnableClass();
        Thread t1 = new Thread(object1);
        ArrayList<String> theList = new ArrayList<>();
        object1.setTheSharedList(theList);
        object1.setTheName("Ria");
        t1.start();

        MyRunnableClass object2 = new MyRunnableClass();
        Thread t2 = new Thread(object2);
        object2.setTheSharedList(theList);
        object2.setTheName("Ishmael");
        t2.start();

        MyRunnableClass object3 = new MyRunnableClass();
        Thread t3 = new Thread(object3);
        object3.setTheSharedList(theList);
        object3.setTheName("George");
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(theList);
    }
}