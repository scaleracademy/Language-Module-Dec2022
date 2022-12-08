package org.example.inheritence;

public class Inheritence {
    static class Fruit {
        private String color = "yellow";

        public String getColor() {
            return color;
        }
    }

    static class Mango extends Fruit {
    }

    public static void main(String[] args) {
        Mango m = new Mango();
        System.out.println(m.getColor());
    }
}
