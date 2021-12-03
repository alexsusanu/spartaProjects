package com.sparta.sortingalgos.model;

import java.util.List;

/**
 * Bubble sort algorithm
 */
public class BubbleSort<T extends Comparable<T>> implements ISorting<T>  {

    // takes primitive array as parameter
    @Override
    public void sortingFn(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
        } else {

            int lenArray = arr.length;
            int temp;
            for (int i = 0; i < lenArray; i++) {
                for (int j = 1; j < lenArray; j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    @Override
    public void sortingFn(List<T> list) {
        T temp;
        if (list.size()>1)
        {
            for (int i=0; i<list.size(); i++)
            {
                for (int j=0; j < list.size()-i-1; j++) {
                    if (list.get(j).compareTo(list.get(j+1)) > 0)
                    {
                        temp = list.get(j);
                        list.set(j,list.get(j+1) );
                        list.set(j+1, temp);
                    }
                }
            }
        }
    }
}
