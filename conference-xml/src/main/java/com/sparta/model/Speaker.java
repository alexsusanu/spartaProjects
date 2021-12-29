package com.sparta.model;

public class Speaker {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public Speaker setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Speaker setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

}
