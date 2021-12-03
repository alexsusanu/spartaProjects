package com.sparta.sortingalgos.model;

import java.util.List;


public interface ISorting<T extends Comparable<T>>{
    void sortingFn (int[] arr);
    void sortingFn(List<T> arr);
}
