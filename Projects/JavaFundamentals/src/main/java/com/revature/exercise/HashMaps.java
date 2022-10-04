package com.revature.exercise;

import java.util.HashMap;

public class HashMaps {
    /*
 Below is a list of exercises to help you get familiar with working with the HashMap Collection
  */
    public static void main(String[] args) {

        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated
        HashMap colors = new HashMap<Integer, String>();
        colors.put(1, "red");
        colors.put(2, "blue");
        colors.put(3, "green");
        colors.put(4, "purple");
        colors.put(5, "yellow");
        colors.put(6, "brown");
        System.out.println(colors);
        System.out.println("-------------------------------------------------------------------------");

        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println(colors.size());
        System.out.println("------------------------------------------------------------------------");

        // 3. Write a Java program to test if a map contains a mapping for the specified key
        System.out.println(colors.containsKey(3));
        System.out.println("-------------------------------------------------------------------------");

        // 4. Write a Java program to get the value of a specified key in a map.
        System.out.println(colors.get(2));
        System.out.println("-------------------------------------------------------------------------");

        // 5. Write a Java program to get a set view of the keys contained in this map.
        for (Object i : colors.keySet()){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");

    }
}
