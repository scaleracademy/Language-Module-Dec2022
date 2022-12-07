package org.example.session01.access.pkg1;

public class Person {
    private int age;
    protected String city;
    String phoneNumber;
    public String name;

    public static class Builder {

        public Person build() {
            return new Person();
        }
    }
}
