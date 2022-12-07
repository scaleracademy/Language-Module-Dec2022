package org.example;

import org.example.session01.access.pkg1.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person p = new Person.Builder().build();
    }
}