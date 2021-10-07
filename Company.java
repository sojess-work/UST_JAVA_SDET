package com.ust.test;

public class Company {
    String name;
    public Company(){
        name="abc";
    }
    public static void main(String[] args) {
        Company obj = new Company();
        System.out.println("Company name = " + obj.name);

    }
}
