package com.tayari2.O.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FactorialUsingStream {
    public static void main(String[] args) {
        int num = 5;
        int fact= IntStream.rangeClosed(1,num).reduce(1,(a,b)->a*b);
        System.out.println(fact);

    }
}
