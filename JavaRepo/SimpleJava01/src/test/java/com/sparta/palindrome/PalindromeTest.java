package com.sparta.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @DisplayName("Expect first and last letter to be equal")
    @Test
    public void FirstAndLastLetterAreEqual_TRUE(){
        Palindrome palindrome = new Palindrome();
        String word = "racecar";
        boolean actualOutput = palindrome.checkEqualityFirstAndLastLetter(word);
        boolean expectedResult = true;
        assertEquals(expectedResult, actualOutput);
    }

    @DisplayName("Expect first and last letter to be false")
    @Test
    public void FirstAndLastLetterAreEqual_FALSE(){
        Palindrome palindrome = new Palindrome();
        String word = "racecarb";
        boolean actualOutput = palindrome.checkEqualityFirstAndLastLetter(word);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualOutput);
    }

    @DisplayName("Check for empty string")
    @Test
    public void testForEmpty(){
        Palindrome palindrome = new Palindrome();
        String word = "";
        boolean actualResult = palindrome.isPalindrome(word);
        boolean expectedResult = false;

        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Expect false if param is null")
    @Test
    public void testForNull(){
        Palindrome palindrome = new Palindrome();
        String word = null;
        boolean actualResult = palindrome.isPalindrome(word);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }


}
