package com.sparta.factorial;

public class FactorialDriver {
    public static void main(String[] args) {
       Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFactorial(23));
        System.out.println(factorial.calculateFactorialBigInt(31));
    }
}
