package com.sparta.sortingalgos.model;

import com.sparta.sortingalgos.utils.SortingType;

public class SortingFactory {
    public static ISorting getSorting(SortingType type){
        switch (type) {
            case Bubble:
                return new BubbleSort();
            case Quick:
                return new QuickSort();
        }
        return null;
    }
}
