package com.sparta.oopExample;

public class Supplier extends Person {
    public Supplier(String postcode, String firstName, String lastName){
        super(postcode, firstName, lastName);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending email from Supplier");
    }
}
