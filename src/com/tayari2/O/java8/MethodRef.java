package com.tayari2.O.java8;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    public void test(String s) {
        System.out.println(s);
    }

    public static void show() {
        System.out.println("show with out loop");
    }

    public static void main(String[] args) {
        MethodRef methodRef = new MethodRef();
        List<String> list = Arrays.asList("Sachin", "Ankit", "Somesh");
        list.forEach(e -> System.out.println(e));
        System.out.println("####With Lambda");
        list.forEach(e -> methodRef.test(e));
        System.out.println("####With Method Ref");
        list.forEach(methodRef::test);
        Runnable runnable = MethodRef::show;
        runnable.run();

        System.out.println("*************** Constructor Reference *****************");

        list.stream().map(e->new Student(e)).collect(Collectors.toList());
        System.out.println(list);
    }
}
class Student{
    public Student(String name) {
        this.name = name;
    }

    String name;
}