package org.example.access.pkg1;

public class ClassOne {
    public String publicField = "public";
    protected String protectedField = "protected";
    String defaultField = "default";
    private String privateField = "private";

    void dynamicMethodInsideClass() {
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
        System.out.println(privateField);
    }

    static void staticMethodInsideClass() {
        ClassOne c1 = new ClassOne();
        System.out.println(c1.publicField);
        System.out.println(c1.protectedField);
        System.out.println(c1.defaultField);
        System.out.println(c1.privateField);
    }

    class ClassOneInner {
        void dynamicMethodInsideInnerClass() {
            System.out.println(publicField);
            System.out.println(protectedField);
            System.out.println(defaultField);
            System.out.println(privateField);
        }
    }

    static class ClassOneInnerStatic {
        void dynamicMethodInsideInnerClass() {
            ClassOne c1 = new ClassOne();
            System.out.println(c1.publicField);
            System.out.println(c1.protectedField);
            System.out.println(c1.defaultField);
            System.out.println(c1.privateField);
        }
    }
}
