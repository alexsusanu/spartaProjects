package com.sparta.fibonacci;

public class Fib {

    public String calculateFib(int i) {
        if (i <= 0) {
            return null;
        }
        String result = "0, 1, ";
        int i1 = 0;
        int i2 = 1;
        for (int index = 2; index < i; index++) {
            int nextValue = i1 + i2;
            result += nextValue + ", ";
            i1 = i2;
            i2 = nextValue;
        }
        return result;
    }

    public String calculateFibRec(int i){
        String result = "";
        if(i < 2){
            result = "0, 1";
        }else{
            result += calculateFibRec(i - 1) + calculateFibRec(i - 2);
        }
        return result;
    }
}
