package org.example.session01;

public class Inheritance {
    static class Fruit {}
    static class Apple extends Fruit {
        void eatApple() {}
    }

    public static void main(String[] args) {
        Fruit f = new Apple();

        ((Apple) f).eatApple();
    }
}
