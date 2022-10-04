package com.revature.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    /*
   Below is a list of exercises to help you get familiar with working with the ArrayList Collection
    */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList colors = new ArrayList<String>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        colors.add("brown");
        colors.add("black");
        colors.add("orange");
        colors.add("pink");
        System.out.println(colors);
        System.out.println("-----------------------------------------------------------------------");
        // 2. Write a Java program to iterate through all elements in an array list
        for (Object color : colors){
            System.out.println(color);
        }
        System.out.println("-----------------------------------------------------------------------");
        // 3. Write a Java program to insert an element into the array list at the first position
        colors.add(0, "lavendar");
        System.out.println(colors);
        System.out.println("------------------------------------------------------------------------");

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(5));
        System.out.println("---------------------------------------------------------------------------");

        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(3);
        System.out.println(colors);
        System.out.println("----------------------------------------------------------------------------");

        // 6. Write a Java program to search an element in an array list.
        System.out.println(colors.contains("blue"));
        System.out.println("------------------------------------------------------------------------------");

        // 7. Write a Java program to sort a given array list.
        Collections.sort(colors);
        for (Object i : colors) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
}
