package com.sparta.sortingalgos;

import com.sparta.sortingalgos.model.BubbleSort;
import com.sparta.sortingalgos.utils.RandomGenerator;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    private BubbleSort bubbleSort;
    private RandomGenerator randomGenerator;
    int[] myArray, myArrayEmpty;
    int[] getMyArrayWithDuplicates = {4,1,5,1,6,3,0,4,1,2,9,8,9};

    @BeforeEach
    public void setUp(){
        int seed = 100;
        bubbleSort = new BubbleSort();
        randomGenerator = new RandomGenerator();
        myArray = randomGenerator.generateArray(seed);
//        myArrayEmpty = randomGenerator.getMyArrayEmpty(); // to redo here
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Done!");
    }

    @DisplayName("Testing with duplicates")
    @Test
    public void testWithDuplicates(){
       bubbleSort.sortingFn(getMyArrayWithDuplicates);
       int[] expectedOutput = {0,1,1,1,2,3,4,4,5,6,8,9,9};
       assertArrayEquals(expectedOutput, getMyArrayWithDuplicates);
    }

    @DisplayName("Test for array empty")
    @Test
    public void testForEmpty(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        bubbleSort.sortingFn(myArrayEmpty);
        String emptyArrayMessage = "Array is empty\n";

        assertEquals(emptyArrayMessage, out.toString());
    }

    @DisplayName("Testing for random generated array")
    @org.junit.Test
    public void testForRandomUsingJavaBuiltIn(){
        int[] m = myArray;
        bubbleSort.sortingFn(myArray);
        Arrays.sort(m);
        assertArrayEquals(m, myArray);
    }
}
