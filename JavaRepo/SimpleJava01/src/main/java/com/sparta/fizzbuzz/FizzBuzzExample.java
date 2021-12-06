package com.sparta.fizzbuzz;

public class FizzBuzzExample {

    public static String fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        if(n == 3){
           return fizz;
        }else if(n == 5){
            return buzz;
        }else if(n % 5 == 0){
            return buzz;
        }else if(n == 15){
            return "FizzBuzz";
        }
        return null;
    }
}
