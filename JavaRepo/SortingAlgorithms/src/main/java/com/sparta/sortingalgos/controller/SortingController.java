package com.sparta.sortingalgos.controller;

import com.sparta.sortingalgos.utils.*;
import com.sparta.sortingalgos.model.SortingFactory;
import com.sparta.sortingalgos.view.SortingView;

import java.util.*;

import static com.sparta.sortingalgos.utils.Logging.invalidInput;

//TODO to add comparable helper method
/**
 * Controller -> consists of the sorting choice algorithm
 *               which calls the SortingFactory
 */
public class SortingController {
    private static long start, end;

    public static void sortChoice(SortingType type, int seed){
        SortingView sortingView = new SortingView();
        RandomGenerator randomGenerator = new RandomGenerator();
        Timing timing = new Timing();

        int[] primitiveArray = randomGenerator.generateArray(seed);
        List<Integer> arrayList = new ArrayList<>();
        randomGenerator.generateListArray(arrayList, seed);

        switch (type) {
            case Bubble:
                try{
                    /*
                     * Display and run bubble algo for primitive array
                     */
                    System.out.println();
                    System.out.println(sortingView.display(primitiveArray, BeforeAfter.Before));
                    helper(primitiveArray, sortingView, SortingType.Bubble, timing);

                    /*
                     * Display and run primitive array with Arrays.sort builtin
                     */
                    arraysSortHelper(primitiveArray, sortingView, timing);
                    System.out.println();

                    /*
                     * Display and run bubble algo for array list
                     */
                    System.out.println(sortingView.display(arrayList, BeforeAfter.Before));
                    helper(arrayList, sortingView, SortingType.Bubble, timing);

                }catch (NullPointerException e){
                    Logging.logger.warn(invalidInput);
                    e.printStackTrace();
                }
                break;
            case Quick:
                try{
                    /*
                     * Display and run quick algo for primitive array
                     */
                    System.out.println();
                    System.out.println(sortingView.display(primitiveArray, BeforeAfter.Before));
                    helper(primitiveArray, sortingView, SortingType.Quick, timing);

                    /*
                     * Display and run primitive array with Arrays.sort builtin
                     */
                    arraysSortHelper(primitiveArray, sortingView, timing);
                    System.out.println();

                    /*
                     * Display and run quick algo for array list
                     */
                    System.out.println(sortingView.display(arrayList, BeforeAfter.Before));
                    helper(arrayList, sortingView, SortingType.Quick, timing);
                }catch (NullPointerException e){
                    Logging.logger.warn(invalidInput);
                    e.printStackTrace();
                }
                break;
            default:
                Logging.logger.info(invalidInput);
                sortingView.displayMenu();
        }
    }

    //TODO repetitive code below, to refactor further all 3 methods

    /**
     * Helper method to display the primitive array before and after
     * @param primitiveArray self-explanatory
     * @param sortingView before and after
     * @param sortingType choice of sorting algorithm (not builtin)
     * @param timing time execution
     */
    private static void helper(int[] primitiveArray, SortingView sortingView, SortingType sortingType, Timing timing){
        try {
            start = timing.getStartTime();
            SortingFactory.getSorting(sortingType).sortingFn(primitiveArray);
            end = timing.getEndTime();

            System.out.println(sortingView.display(primitiveArray, BeforeAfter.After));
            System.out.print("Total time taken using primitive array: ");
            sortingView.displayTime(timing.timeResult(start, end));
            System.out.println();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    /**
     * Helper method to display the array list before and after
     * @param arr List<Integer>
     * @param sortingView before and after
     * @param sortingType choice of sorting algorithm (not builtin)
     * @param timing time execution
     */
    private static void helper(List<Integer> arr, SortingView sortingView, SortingType sortingType, Timing timing){
        try{
            start = timing.getStartTime();
            SortingFactory.getSorting(sortingType).sortingFn(arr);
            end = timing.getEndTime();

            System.out.println(sortingView.display(arr, BeforeAfter.After));
            System.out.print("Total time taken using ArrayList array: ");
            sortingView.displayTime(timing.timeResult(start, end));
            System.out.println();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    /**
     * Helper method to sort the primitive array using builtin Arrays.sort()
     * @param arr primitive array
     * @param sortingView display the array before and after
     * @param timing time execution
     */
    private static void arraysSortHelper(int[] arr, SortingView sortingView, Timing timing){
        start = timing.getStartTime();
        Arrays.sort(arr);
        end = timing.getEndTime();

        System.out.println(sortingView.display(arr, BeforeAfter.After));
        System.out.print("Total time taken using primitive array with builtin sort method (Arrays.sort): ");
        sortingView.displayTime(timing.timeResult(start, end));
        System.out.println();
    }

    /**
     * Helper method to sort the primitive array using builtin Arrays.sort()
     * @param arr primitive array
     * @param sortingView display the array before and after
     * @param timing time execution
     */
    private static void collectionSortHelper(List<Integer> arr, SortingView sortingView, Timing timing){
        start = timing.getStartTime();
        Collections.sort(arr);
        end = timing.getEndTime();

        System.out.println();
        System.out.println(sortingView.display(arr, BeforeAfter.After));
        System.out.print("Total time taken using primitive array with builtin sort method (Arrays.sort): ");
        sortingView.displayTime(timing.timeResult(start, end));
        System.out.println();
    }

//    /**
//     * QUICK SORT MULTITHREADED ATTEMPT
//     */
//    private static void helperThread(int[] primitiveArray, SortingView sortingView, SortingType sortingType, Timing timing){
//        try {
//            start = timing.getStartTime();
////            SortingFactory.getSorting(sortingType).sortingFn(primitiveArray);
//            MultithreadHelper.startThread();
//            end = timing.getEndTime();
//
////        System.out.println();
//            System.out.println(sortingView.display(primitiveArray, BeforeAfter.After));
//            System.out.print("Total time taken with MULTI-THREAD: ");
//            sortingView.displayTime(timing.timeResult(start, end));
//            System.out.println();
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
//    }
}
