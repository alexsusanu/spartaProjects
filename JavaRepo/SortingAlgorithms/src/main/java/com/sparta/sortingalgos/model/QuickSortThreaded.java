package com.sparta.sortingalgos.model;

import com.sparta.sortingalgos.utils.Logging;

import static com.sparta.sortingalgos.utils.Logging.MAX_ARRAY_SIZE;
import static com.sparta.sortingalgos.utils.Logging.notImplementedWarning;

import java.util.List;


/**
 * Quick sort algorithm with multithreading (attempt)
 */
public class QuickSortThreaded<T extends Comparable<T>> implements Runnable, ISorting<T> {
    int[] arr = new int[MAX_ARRAY_SIZE];
    int begin = 0;
    int end = arr.length - 1;


    public QuickSortThreaded(int[] arr){
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    // takes primitive array as parameter
//    @Override
    public void sortingFn(int[] arr) {
//        System.out.println("arrived in sortingFn " + Thread.currentThread().getName());
        if(arr != null) {
            sortingQ(arr, 0, arr.length - 1);
        }
    }

    // primitive int array helper method
    public void sortingQ(int[] arr, int begin, int end) {
//        System.out.println("arrived in sortingQ " + Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortingQ(arr, begin, partitionIndex-1);
            sortingQ(arr, partitionIndex+1, end);
        }
    }
    // primitive int array helper method
    private int partition(int arr[], int begin, int end) {
//        System.out.println("arrived in partition " + Thread.currentThread().getName());
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
        Logging.logger.fatal(notImplementedWarning);
    }

    @Override
    public void run() {
        sortingFn(arr);
    }
}