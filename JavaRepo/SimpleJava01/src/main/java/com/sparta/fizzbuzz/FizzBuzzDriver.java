package com.sparta.fizzbuzz;

public class FizzBuzzDriver {
    public static void main(String[] args) {
        int max = 50;
        for(int i = 1; i <= max; i++){
            System.out.println(FizzBuzzExample.fizzBuzz(i));
        }
    }
}
