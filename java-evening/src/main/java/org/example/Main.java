package org.example;

import org.example.abstractvsinterface.Database;
import org.example.abstractvsinterface.Storage;

public class Main {
    public static class Fruit {}
    public class Apple extends Fruit {}

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fruit f = new Fruit();

        Main m = new Main();
        m.appleMaker();
//
//        Database localDB = new Database(new Storage.LocalStorage());
//        Database inMemDB = new Database(new Storage.MemoryStorage());

    }

    void appleMaker() {
        Apple a = new Apple();
        System.out.println(a);
        Another an = new Another();
    }
}