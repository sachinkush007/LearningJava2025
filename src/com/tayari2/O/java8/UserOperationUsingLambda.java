package com.tayari2.O.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserOperationUsingLambda {
    public static void main(String[] args) {
        User user = new User(3, "Sachin", 24);
        User user1 = new User(1, "Ankit", 22);
        User user2 = new User(4, "Amit", 23);
        User user3 = new User(2, "Sahil", 24);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("Before Sort" + userList);

        //filtered list by name Using Anonymous class
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(userList, comparator);
        System.out.println("Using Anonymous: " + userList);

        //filtered list by name Using Lambda
        Collections.sort(userList, (a,b)->a.getName().compareTo(b.getName()));

        System.out.println("Using Lambda: " + userList);
        //filtered list by id in descending order
        Collections.sort(userList, (a, b) -> b.id - a.id);
        System.out.println("Filtered users with age 24 sorted by id in descending order:");
        System.out.println(userList);

        // Filter users whose age is 24
        List<User> ageFilteredList = userList.stream()
                .filter(e -> e.age == 24)
                .collect(Collectors.toList());
        System.out.println("Filtered users with age 24:");
        System.out.println(ageFilteredList);

    }
}