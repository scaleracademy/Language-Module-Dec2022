package org.example.generics;

import java.util.List;

public class Variance {

    static class Fruit {
        String name;
        String taste;

        public Fruit(String name, String taste) {
            this.name = name;
            this.taste = taste;
        }
    }
    static class Mango extends Fruit {
        public Mango(String name, String taste) {
            super(name + " Mango", taste);
        }
    }

    static void printFruits(List<? extends Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " tastes " + fruit.taste);
        }
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Sweet");
        Fruit kiwi = new Fruit("Kiwi", "Sour");
        Mango alphonso = new Mango("Alphonso", "Sweet");
        Mango kesar = new Mango("Kesar", "Sweet");

        List<Fruit> fruitBowl = List.of(apple, kiwi);
        printFruits(fruitBowl);

        List<Mango> mangoBasket = List.of(alphonso, kesar);
        printFruits(mangoBasket);

        fruitBowl.add(alphonso);
        fruitBowl.addAll(mangoBasket);

    }
}
