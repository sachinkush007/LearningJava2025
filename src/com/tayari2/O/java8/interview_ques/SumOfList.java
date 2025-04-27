package com.tayari2.O.java8.interview_ques;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum=list.stream().mapToInt(e->e).sum();
        System.out.println(sum);
    }
}