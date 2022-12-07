package org.example.session01.access.pkg1;

public class Person {
    private int age;
    protected String city;
    String phoneNumber;
    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length == 2) {
            firstName = names[0];
            lastName = names[1];
        } else if (names.length == 1) {
            firstName = names[0];
            lastName = "";
        } else if (names.length == 0) {
            firstName = "";
            lastName = "";
        } else {
            firstName = names[0];
            lastName = names[names.length - 1];
        }
    }
    public boolean hasLastName () {
        return lastName != null && !lastName.isEmpty();
    }

    public static class Builder {

        public Person build() {
            return new Person();
        }
    }
}
