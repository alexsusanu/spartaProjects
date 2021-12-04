package com.sparta.threadexample;

public class SomeTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Inside the SomeTask class. Thread number: " + Thread.currentThread().getName());
        }
}
