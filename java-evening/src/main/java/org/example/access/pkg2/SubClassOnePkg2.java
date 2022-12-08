package org.example.access.pkg2;

import org.example.access.pkg1.ClassOne;

// SUBCLASS INSIDE DIFFERENT PACKAGE
public class SubClassOnePkg2 extends ClassOne {

    void dynamicMethodInsideSubClassOnePkg2() {
        System.out.println(publicField);
        System.out.println(protectedField);
        // DOES NOT WORK
        // System.out.println(defaultField);
        // System.out.println(privateField);
    }
}
