package com.designPattern;

public class Singleton {

    String s;
    public static Singleton instance;

    private Singleton() {
        s = "Hello! I am Sachin";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

class Main {
    public static void main(String[] args) {
        String string = "Sachin";

        // Instantiating Singleton class with variable s
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Printing the hash code for above variable as
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        if (instance1.equals(instance2)) {
            System.out.println("BOTH objects point to the same memory location on the heap i.e, to the same object");
        }

        // Now changing variable of instance1 via toUpperCase() method
        instance1.s = instance1.s.toUpperCase();
        System.out.println(instance1.s);

        instance2.s = (instance1.s).toUpperCase();
        System.out.println(instance2.s);

        // Now again changing variable of instance2 toLowerCase

        System.out.println(instance1.s = instance1.s.toLowerCase());
        System.out.println(instance2.s = instance2.s.toUpperCase());


        Main m = new Main();
        System.out.println(m.hashCode());
        Main m1 = new Main();
        System.out.println(m1.hashCode());

        if (m == m1) {
            System.out.println("BOTH objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println("BOTH objects DO NOT point to the same memory location on the heap");
        }
    }
}
