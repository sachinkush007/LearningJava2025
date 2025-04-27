package com.tayari2.O.java8.interview_ques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "aabbcccdeefg";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((k,v)-> System.out.println(k+"::"+v));
        str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((k, v) -> System.out.println(k + "::" + v));
    }
}