package com.sparta.sortingalgos.utils;

import com.sparta.sortingalgos.model.QuickSortThreaded;

import java.util.Random;

public class MultithreadHelper {
    public static void startThread(){
        int[] array = new int[100];
        Random random = new Random();
            for(int i = 0; i < 100; i++){
            array[i] = random.nextInt(100);
        }
        QuickSortThreaded<Integer> quickSortThreaded = new QuickSortThreaded<>(array);
        Thread thread1 = new Thread(quickSortThreaded);
        Thread thread2 = new Thread(quickSortThreaded);
        Thread thread3 = new Thread(quickSortThreaded);

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
            array = quickSortThreaded.getArr();
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
