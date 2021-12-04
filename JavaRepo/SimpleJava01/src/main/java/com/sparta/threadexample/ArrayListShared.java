package com.sparta.threadexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListShared implements Runnable{
    List<Integer> arrayList;
    int i;

    public List<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        Random random = new Random();
        int i;
        i = random.nextInt(10);
        arrayList.add(i);
        System.out.println("on thread: " + Thread.currentThread().getName() + " " + "added to shared list: " + i);
    }
}
