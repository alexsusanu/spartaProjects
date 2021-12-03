package com.sparta.factorial;

import java.math.BigInteger;

public class Factorial {

    public int calculateFactorial(int i) {
        if (i <= 1){
            return 1;
        }
        return i * calculateFactorial(i-1);
    }

    public BigInteger calculateFactorialBigInt(int i) {
        BigInteger calculateFactorialBigInt = BigInteger.ONE;

        for(int j = i; j > 0; j--){
            calculateFactorialBigInt = calculateFactorialBigInt.multiply(BigInteger.valueOf(j));
        }
        return calculateFactorialBigInt;
    }
}
