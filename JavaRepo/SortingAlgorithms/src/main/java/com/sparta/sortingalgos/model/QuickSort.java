package com.sparta.sortingalgos.model;

import com.sparta.sortingalgos.utils.Logging;

import java.util.List;

/**
 * Quick sort algorithm
 */
public class QuickSort<T extends Comparable<T>> implements ISorting<T>{

    // takes primitive array as parameter
    @Override
    public void sortingFn(int[] arr) {
        sortingQ(arr, 0, arr.length-1);
    }

    // primitive int array helper method
    private void sortingQ(int[] arr, int begin, int end) {
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
    }
}
