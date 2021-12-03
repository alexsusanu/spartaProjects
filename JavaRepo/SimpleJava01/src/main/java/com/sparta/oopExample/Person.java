package com.sparta.oopExample;

public abstract class Person{
    private String postCode;
    private String firstName;
    private String lastName;

    public Person(){};

    public Person(String firstName, String lastName, String postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postcode;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        // add validation
        this.postCode = postCode;
    }

    public abstract void sendEmail(String message);
}
