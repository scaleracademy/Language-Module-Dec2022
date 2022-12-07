package org.example.session01.access.pkg1;

public class Person {
    private int age;
    protected String city;
    String phoneNumber;
    private String[] nameSegments;

    public String getFullName() {
        return String.join(" ", nameSegments);
    }

    public void setFullName(String fullName) {
        this.nameSegments = fullName.split(" ");

    }
    public boolean hasLastName () {
        return nameSegments.length > 1;
    }

    public static class Builder {

        public Person build() {
            return new Person();
        }
    }
}
