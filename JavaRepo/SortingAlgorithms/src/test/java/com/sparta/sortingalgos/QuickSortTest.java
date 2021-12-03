package com.sparta.sortingalgos;

import com.sparta.sortingalgos.model.QuickSort;
import com.sparta.sortingalgos.utils.RandomGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    private QuickSort quickSort;
    private RandomGenerator randomGenerator;
    int[] myArray, myArrayEmpty;
    int[] getMyArrayWithDuplicates = {4,1,5,1,6,3,0,4,1,2,9,8,9};

    @BeforeEach
    public void setUp(){
        int seed = 100;
        quickSort = new QuickSort();
        randomGenerator = new RandomGenerator();
        myArray = randomGenerator.generateArray(seed);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Done!");
    }

    @DisplayName("Testing with duplicates")
    @Test
    public void testWithDuplicates(){
        quickSort.sortingFn(getMyArrayWithDuplicates);
        int[] expectedOutput = {0,1,1,1,2,3,4,4,5,6,8,9,9};
        assertArrayEquals(expectedOutput, getMyArrayWithDuplicates);
    }

    @DisplayName("Test for array empty")
    @Test
    public void testForEmpty(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        quickSort.sortingFn(myArrayEmpty);
        String emptyArrayMessage = "Array is empty\n";

        assertEquals(emptyArrayMessage, out.toString());
    }

    @DisplayName("Testing for random generated array")
    @Test
    public void testForRandomUsingJavaBuiltIn(){
        int[] m = myArray;
        quickSort.sortingFn(myArray);
        Arrays.sort(m);
        assertArrayEquals(m, myArray);
    }

}