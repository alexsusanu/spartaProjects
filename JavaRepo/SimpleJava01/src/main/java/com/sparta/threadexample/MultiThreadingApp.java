package com.sparta.threadexample;

import java.util.Random;

public class MultiThreadingApp {
    public static void main(String[] args) {
//        int[] sortedArray;
        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            array[i] = random.nextInt(100);
        }
        QuickSort<Integer> quickSort = new QuickSort<>(array);
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

        try{
            array = quickSort.getArr();
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println(array.length);
        }catch(NullPointerException e){
            e.printStackTrace();
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
