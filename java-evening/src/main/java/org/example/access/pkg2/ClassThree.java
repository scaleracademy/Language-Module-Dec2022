package org.example.access.pkg2;

import org.example.access.pkg1.ClassOne;

// UNRELATED CLASS, IN DIFFERENT PACKAGE
public class ClassThree {

    void dynamicMethodInsideClassThree() {
        ClassOne c1 = new ClassOne();
        System.out.println(c1.publicField);
        // DOES NOT WORK
        // System.out.println(c1.protectedField);
        // System.out.println(c1.defaultField);
        // System.out.println(c1.privateField);
    }
}
