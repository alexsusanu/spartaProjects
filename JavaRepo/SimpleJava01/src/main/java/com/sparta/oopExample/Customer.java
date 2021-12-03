package com.sparta.oopExample;

/**
 * all class variables / instance variables should be private
 * all methods should be public (making them private is ok)
 * making the instance variables public is a problem
 * package access - no
 * public, private, protected - only
 */
public final class Customer extends Person implements Comparable<Customer>, Emailable{
//    private String firstName; // private ony visible to the Customer class only
//    private String lastName; // default -> package access - not writing private, public, protected

    private int customerId;
    private double accountBalance;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", accountBalance=" + accountBalance +
                '}';
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId > 0)
            this.customerId = customerId;
        else
            this.customerId = -1;
    }


    public Customer(){};

    public Customer(int customerId, String firstName, String lastName, String postCode){
        this.customerId = customerId;
        setFirstName(firstName);
        setLastName(lastName);
        setPostCode(postCode);
    }

    public Customer(String firstName, String lastName, String postCode){
        this(0, firstName, lastName, postCode);
    }

    public String convertToString(){
        return "Customer #" + customerId + ": " + getFirstName() + " " + getLastName() + ", " + getPostCode();
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending email from Customer class to: " + getFirstName() + " " + getLastName());
    }

    @Override
    public int compareTo(Customer o) {
//        return getLastName().compareTo(o.getLastName());
//        return new Integer (getCustomerId()).compareTo(new Integer(o.getCustomerId()));
        return getCustomerId() - o.getCustomerId();
    }
}
