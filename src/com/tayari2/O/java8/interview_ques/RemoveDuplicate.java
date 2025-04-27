package com.tayari2.O.java8.interview_ques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,2,5,2,8,5,9);
        // Using Java 8
        List<Integer>uniqueList=list.stream().distinct().toList();
        System.out.println(uniqueList);

        // Using HashSet

        HashSet hashSet=new HashSet<>(list);
        System.out.println(hashSet);
    }
}
