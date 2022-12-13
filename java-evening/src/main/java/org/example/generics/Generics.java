package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        List list = new ArrayList();
        list.add("Hello");
        list.add(1);
        list.add(true);
        System.out.println(list.size());

        stringList.add("asdsa");
        stringList.add(String.valueOf(12)); // actually inserting a string only
        // stringList.add((String) 12); // invalid typecasting
        ((List) stringList).add(12);
        System.out.println(stringList.size());

        if (((List)stringList).get(2) instanceof Integer) {
            System.out.println("Integer");
        }
        if (((List)stringList).get(1) instanceof String) {
            System.out.println("String");
        }

        // READ MORE: "Type Erasure" in Java
    }
}
