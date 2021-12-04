package com.sparta.threadexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MultiThreadingApp {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        QuickSort<Integer> quickSort = new QuickSort<>();
        Thread thread1 = new Thread(quickSort);
        Thread thread2 = new Thread(quickSort);
        Thread thread3 = new Thread(quickSort);

        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        arrayList = quickSort.getArrayList();
        for(int i:arrayList){
            System.out.print(i + " ");
        }
    }

}

//        QuickSort<Integer> quickSort1 = new QuickSort<>();
//        QuickSort<Integer> quickSort2 = new QuickSort<>();
//        List<Integer> sharedList = new ArrayList<>();
//        ArrayListShared arrayListShared1 = new ArrayListShared();
//        ArrayListShared arrayListShared2 = new ArrayListShared();
//        ArrayListShared arrayListShared3 = new ArrayListShared();
//        ArrayListShared arrayListShared4 = new ArrayListShared();
//        Random random = new Random();
//
//        Thread thread1 = new Thread(arrayListShared1);
//        Thread thread2 = new Thread(arrayListShared2);
//        Thread thread3 = new Thread(arrayListShared3);
//        Thread thread4 = new Thread(arrayListShared4);
//        arrayListShared1.setArrayList(sharedList);
//        arrayListShared2.setArrayList(sharedList);
//        arrayListShared3.setArrayList(sharedList);
//        arrayListShared4.setArrayList(sharedList);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        try{
//            thread1.join();
//            thread2.join();
//            thread3.join();
//            thread4.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        for(int i : sharedList){
//            System.out.print(i + " ");
//        }
