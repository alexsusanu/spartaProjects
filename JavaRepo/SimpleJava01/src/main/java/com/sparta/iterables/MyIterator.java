package com.sparta.iterables;

import java.util.Iterator;
import java.util.Random;

public class MyIterator<T> implements Iterator<T> {
    private Random rand;

    public MyIterator() {
        rand = new Random();
    }

    @Override
    public boolean hasNext() {
        return rand.nextInt(1000) != 0; // if not equal to zero, continue
    }

    @Override
    public T next() {
        return (T) ((Integer) rand.nextInt(1000));
    }
}
