package org.example.session02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

    static class Fruit {
        String name;

        public Fruit(String name) {
            this.name = name;
        }
    }
    static class Apple extends Fruit {
        public Apple(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(1);
        list.add(1.0);
        list.add(true);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange"));
        fruits.add(new Fruit("Banana"));

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Kashmir Apple"));
        apples.add(new Apple("Green Apple"));

        fruits.addAll(apples);
//        apples.addAll(fruits);

        printFruits(fruits);
        printFruits(apples);

        Collections.copy(fruits, apples);
    }

    static void printFruits(List<? extends Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name);
        }
    }
}
