package com.sparta.sortingalgos.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;

/**
 * Logger using log4j2
 */
public class Logging {
    public static Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());


    /**
     * Default messages for errors or algorithm choice
     */
    public static final int MAX_ARRAY_SIZE = 5000; // max size for arrays
    public static final String notImplementedWarning = "NOT IMPLEMENTED";
    public static final String unknownOption = "Unknown option. Choice: bubble or quick (q to exit) > ";
    public static final String invalidInput = "Invalid input";
    public static final String invalidInputTryAgain = "Invalid input for seed. Try again: (q to exit) > ";
    public static final String bubblesortChosen = "Bubble sort chosen";
    public static final String quicksortChosen = "QuickSort chosen";
    public static final String bubble = "bubble";
    public static final String quick = "quick";
    public static final String quit = "q";
    public static final String exit = "Goodbye! Exiting";
    public static final String algoChoice = "Please choose sorting option: BubbleSort (bubble), QuickSort (quick). " +
                                            "To exit (q) > ";
}
