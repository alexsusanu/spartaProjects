package com.sparta.generics;

public class Container <M> {
    private M theInstance;

    public void storeInstance(M theValue){
        theInstance = theValue;
    }

    public M retrieveInstance(){
        return theInstance;
    }
}
