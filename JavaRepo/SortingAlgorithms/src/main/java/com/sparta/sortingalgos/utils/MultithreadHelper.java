package com.sparta.sortingalgos.utils;

import com.sparta.sortingalgos.model.QuickSortThreaded;

public class MultithreadHelper {
    public static void startThread(int[] array){
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
    }
}
