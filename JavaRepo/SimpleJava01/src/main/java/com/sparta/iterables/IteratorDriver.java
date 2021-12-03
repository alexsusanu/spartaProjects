package com.sparta.iterables;

public class IteratorDriver {
    public static void main(String[] args) {
        IterableExample<Integer> iterableExample = new IterableExample();
        for(Integer val : iterableExample){
            System.out.println(val);
        }
    }
}
