package org.example;

public class Main {
    public static class Fruit {}
    public class Apple extends Fruit {}

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fruit f = new Fruit();

        Main m = new Main();
        m.appleMaker();

    }

    void appleMaker() {
        Apple a = new Apple();
        System.out.println(a);
        Another an = new Another();
    }
}