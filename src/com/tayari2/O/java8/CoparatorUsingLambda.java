package com.tayari2.O.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoparatorUsingLambda {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(23,11,34,77,12,10);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
    }
}
