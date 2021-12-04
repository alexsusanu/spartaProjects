package com.sparta.sortingalgos.utils;

import java.util.List;
import java.util.Random;

import static com.sparta.sortingalgos.utils.Logging.MAX_ARRAY_SIZE;

/**
 * Random number generator for array
 * Default max array size 5000
 */
public class RandomGenerator {
    private Random random = new Random();
    private int[] myArray = new int[MAX_ARRAY_SIZE];
//    private List<Integer> myArrayList;

    /**
     * Generate random numbers, take seed as primitive int
     * @param seed -> generate random between 0..seed (excluded)
     * @return primitive array
     */
    public int[] generateArray(int seed){
        for(int i = 0; i < MAX_ARRAY_SIZE; i++){
            myArray[i] = random.nextInt(seed);
        }
        return myArray;
    }

    /**
     * Generate random numbers, take seed as Integer
     * @param seed -> generate random between 0..seed (excluded)
     */
    public void generateListArray(List<Integer> myArrayList, int seed){
        for(int i = 0; i < MAX_ARRAY_SIZE; i++){
            myArrayList.add(random.nextInt(seed));
        }
    }
}
