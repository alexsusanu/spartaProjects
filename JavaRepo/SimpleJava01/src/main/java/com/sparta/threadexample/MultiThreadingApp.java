package com.sparta.threadexample;

import java.util.List;
import java.util.Random;

public class MultiThreadingApp {
    public static void main(String[] args) {
        RunnableExample2 runnableExample2 = new RunnableExample2();
        Thread thread1 = new Thread(runnableExample2);
        Thread thread2 = new Thread(runnableExample2);
        Thread thread3 = new Thread(runnableExample2);

        List<Integer> myList = runnableExample2.getMyList(); // return array list
        thread1.start();
        thread2.start();
        thread3.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i : myList){
            System.out.print(i + " ");
        }

//        int[] array = new int[100];
//
//        Random random = new Random();
//        for(int i = 0; i < 100; i++){
//            array[i] = random.nextInt(100);
//        }
//        QuickSort<Integer> quickSort = new QuickSort<>(array);
//        Thread thread1 = new Thread(quickSort);
//        Thread thread2 = new Thread(quickSort);
//        Thread thread3 = new Thread(quickSort);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        try{
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//        try{
//            array = quickSort.getArr();
//            for(int i = 0; i < array.length; i++){
//                System.out.print(array[i] + " ");
//            }
//            System.out.println();
//            System.out.println(array.length);
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
    }

}
