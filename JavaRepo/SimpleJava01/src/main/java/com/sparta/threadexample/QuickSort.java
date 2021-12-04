package com.sparta.threadexample;


import java.util.List;
import java.util.Random;

/**
 * Quick sort algorithm
 */
public class QuickSort<T extends Comparable<T>> implements ISorting<T>, Runnable{
    int[] arr = {21,44,87,87,87,97,88,12,54,87};
    int begin = 0;
    int end = arr.length - 1;

    public void getArr() {
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // takes primitive array as parameter
    @Override
    public void sortingFn(int[] arr) {
        if(arr != null) {
            sortingQ(arr, 0, arr.length - 1);
        }
    }

    // primitive int array helper method
    public void sortingQ(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortingQ(arr, begin, partitionIndex-1);
            sortingQ(arr, partitionIndex+1, end);
        }
    }
    // primitive int array helper method
    private int partition(int arr[], int begin, int end) {
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

    @Override
    public void sortingFn(List<T> arr) {
        //TODO
//        Logging.logger.fatal(notImplementedWarning);
    }

    @Override
    public void run() {
        System.out.println("Inside quick sort class. running on thread: " + Thread.currentThread().getName());
        sortingFn(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
