package com.tayari2.O.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CustomPredicate {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer>predicate=(a)->a%2==0;
        System.out.println(predicate.test(11));

        Predicate<String>startWithS=(a)->a.toUpperCase().charAt(0)=='S';
        System.out.println(startWithS.test("Sachin"));

        Predicate<String>endWithN=(a)->a.toUpperCase().charAt(a.length()-1)=='N';

        //And vs or
        Predicate<String> and = startWithS.and(endWithN);
        System.out.println(and.test("Sachin"));

        //Negate
        System.out.println(startWithS.negate().test("sachin"));

        //isEqual
        Predicate<Object>predicateEqual=Predicate.isEqual("123");
        System.out.println(predicateEqual.test("123"));
    }
}
