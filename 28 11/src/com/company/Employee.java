package com.company;

public class Employee extends Human{
    String company;

    public Employee(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }
    
}
