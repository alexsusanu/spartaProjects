package com.sparta.oopExample;


public class SpartaShop {
    public static void main(String[] args) {
        Customer mark = new Customer();
        System.out.println(mark.convertToString());
        mark.setCustomerId(1234);
        mark.setFirstName("mark");
        mark.setLastName("burnitt");
        mark.setPostCode("se1 0aa");

        System.out.println(mark.convertToString());

        Customer talal = new Customer(1, "talal", "thaheem", "sw1a 1aa");
        System.out.println(talal.convertToString());

        Employee alex = new Employee();
        alex.setFirstName("alex");
        System.out.println(alex);
        alex.setPostCode("ab1 0ef");
        System.out.println(alex.getPostCode());

        Person ria = new Employee();
        System.out.println(ria.getLastName());
        System.out.println(((Employee) ria).getDepartment());

        Person pruthvi = new Customer();
        pruthvi.sendEmail("HI");

        alex.sendEmail("hello");
    }
}
