package com.company;

import java.util.Scanner;

public class Main {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Person p = new Person("Test", 3);
        System.out.println("("+p.getName()+", "+p.getAge()+")");
        p.setName("Vasya");
        p.setAge(5);
        System.out.println("("+p.getName()+", "+p.getAge()+")");
        Employee e1 = new Employee("1", 2, "3");
        System.out.println("("+e1.getName()+", "+e1.getAge()+", "+e1.getCompany()+")");
    }
}
