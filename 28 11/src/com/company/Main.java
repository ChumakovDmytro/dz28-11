package com.company;

public class Main {

    public static void main(String[] args) {
        Human h=new Human(5,"Andrey ");
        System.out.print(h.name);
        System.out.println(h.age);
        Employee e=new Employee(30,"Sergey ","Manager ");
        System.out.print(e.company);
        System.out.print(e.name);
        System.out.println(e.age);
    }
}
