package org.example.access.pkg1;

// SUBCLASS, IN SAME PACAKGE
public class SubClassOne extends ClassOne {

    void dynamicMethodInsideSubClassOne() {
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);  // because same package, not because inheritence
        // DOES NOT WORK
        // System.out.println(privateField);
    }
}
