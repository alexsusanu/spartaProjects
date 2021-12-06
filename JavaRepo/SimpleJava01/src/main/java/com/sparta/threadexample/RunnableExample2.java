package com.sparta.threadexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RunnableExample2 implements Runnable{
    private List<Integer> myList = new ArrayList<>();
    private int n;

    public List<Integer> getMyList() {
        return myList;
    }

    public void setMyList(List<Integer> myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
       myList.add(new Random().nextInt(10));
    }
}
