package com.revature.exercise;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {

    /*
      Below is a list of exercises to help you get familiar with working with the HashSet Collection
       */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet foods = new HashSet<>();
        foods.add("pasta");
        foods.add("rice");
        foods.add("omelette");
        foods.add("steak");
        foods.add("chicken");
        foods.add("tuna");
        System.out.println(foods);

        foods.add("tofu");
        System.out.println(foods);
        System.out.println("------------------------------------------------------------------------------");

        // 2. Write a Java program to iterate through all elements in a hash list.
        for (Object food : foods) {
            System.out.println(food);
        }
        System.out.println("-------------------------------------------------------------------------------");

        // 3. Write a Java program to get the number of elements in a hash set
        System.out.println(foods.size());
        System.out.println("------------------------------------------------------------------------------");

        // 4. Write a Java program to test a hash set is empty or not
        System.out.println(foods.isEmpty());
        System.out.println("-------------------------------------------------------------------------------");

        // 5. Write a Java program to convert a hash set to an array.
        String arr[] = new String[foods.size()];
        foods.toArray(arr);
        for (String i : arr) {
            System.out.println(i);
        }

    }
}
