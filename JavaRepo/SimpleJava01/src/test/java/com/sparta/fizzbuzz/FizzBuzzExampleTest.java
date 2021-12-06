package com.sparta.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExampleTest {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2"})
    @DisplayName("Given a number, return number as a string")
    public void givenOne_Return_OneAsString(int n, String expected){
        assertEquals(expected, FizzBuzzExample.fizzBuzz(n));
    }

//    @ParameterizedTest
//    @ValueSource(ints = {6, 12})
//    @DisplayName("Given a number, return number as a string")
//    public void givenOne_Return_OneAsString(int n, String expected){
//        assertEquals("Fizz", FizzBuzzExample.fizzBuzz(n));
//    }
    @Test
    @DisplayName("Given 3, return Fizz")
    public void givenThree_Return_Fizz(){
       assertEquals("Fizz", FizzBuzzExample.fizzBuzz(3));
    }

    @Test
    @DisplayName("Given 5, return Buzz")
    public void givenFive_Return_Buzz(){
       assertEquals("Buzz", FizzBuzzExample.fizzBuzz(5));
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    @DisplayName("Given a number divisible by five but not three return buzz")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int n){
       assertEquals("Buzz", FizzBuzzExample.fizzBuzz(n));
    }

    @Test
    @DisplayName("Given 15 return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(15));
    }

//    @Test
//    @DisplayName("Give a number divisible by fifteen return FizzBuzz")
//    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(){
//
//    }
}