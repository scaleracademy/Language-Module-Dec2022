package org.example.access.pkg1;

// UNRELATED CLASS, INSIDE SAME PACKAGE
public class ClassTwo {

    void dynamicMethodInsideClassTwo() {
        ClassOne c1 = new ClassOne();
        System.out.println(c1.publicField);
        System.out.println(c1.protectedField);  // because same package
        System.out.println(c1.defaultField);    // because same package
        // DOES NOT WORK
        // System.out.println(c1.privateField);
    }
}
