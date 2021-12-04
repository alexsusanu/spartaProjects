package com.sparta.threadexample;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Quick sort algorithm
 */
public class QuickSort<T extends Comparable<T>> implements Runnable{
    int[] arr = new int[100];
    int[] sortedArray;
    int begin = 0;
    int end = arr.length - 1;


    public QuickSort(int[] arr){
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    // takes primitive array as parameter
//    @Override
    public void sortingFn(int[] arr) {
        System.out.println("arrived in sortingFn " + Thread.currentThread().getName());
        if(arr != null) {
            sortingQ(arr, 0, arr.length - 1);
        }
    }

    // primitive int array helper method
    public void sortingQ(int[] arr, int begin, int end) {
        System.out.println("arrived in sortingQ " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortingQ(arr, begin, partitionIndex-1);
            sortingQ(arr, partitionIndex+1, end);
        }
    }
    // primitive int array helper method
    private int partition(int arr[], int begin, int end) {
        System.out.println("arrived in partition " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

//    @Override
    public void sortingFn(List<T> arr) {
        //TODO
//        Logging.logger.fatal(notImplementedWarning);
    }

    @Override
    public void run() {
        sortingFn(arr);
    }
}
