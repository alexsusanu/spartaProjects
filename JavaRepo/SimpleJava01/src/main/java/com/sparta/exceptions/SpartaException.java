package com.sparta.exceptions;

public class SpartaException extends Exception{
    public SpartaException(Throwable cause) {
        super(cause);
        System.out.println("sparta exception");
    }
}
