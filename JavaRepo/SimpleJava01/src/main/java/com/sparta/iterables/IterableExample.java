package com.sparta.iterables;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableExample<T> implements Iterable<T>{
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
}
