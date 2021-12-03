package com.sparta.oopExample;

public class Employee extends Person{
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                '}';
    }


    public Employee(){};

    public Employee(String deparment, String firstName, String lastName, String postcode){
        super(postcode, firstName, lastName);
        this.department = deparment;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending email from Employee class to: " + getFirstName() + " " + getLastName());
    }
}
