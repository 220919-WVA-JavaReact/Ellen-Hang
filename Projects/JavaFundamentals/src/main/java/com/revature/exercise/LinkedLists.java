package com.revature.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    /*
   Below is a list of exercises to help you get familiar with working with the ArrayList Collection
    */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        LinkedList animals = new LinkedList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("penguin");
        animals.add("polar bear");
        animals.add("horse");
        animals.add("tiger");
        animals.add("goat");
        System.out.println(animals);

        animals.add("donkey");
        System.out.println(animals);
        System.out.println("----------------------------------------------------------------------------");

        // 2. Write a Java program to iterate through all elements in a linked list.
        for (Object animal : animals) {
            System.out.println(animal);
        }
        System.out.println("--------------------------------------------------------------------------------");

        // 3. Write a Java program to iterate a linked list in reverse order
        Collections.reverse(animals);
        System.out.println(animals);
        System.out.println("----------------------------------------------------------------------------------");

        // 4.  Write a Java program to insert the specified element at the front of a linked list
        animals.add(0,"elephant");
        System.out.println(animals);
        System.out.println("----------------------------------------------------------------------------------");

        // 5. Write a Java program to insert some elements at the specified position into a linked list.
        animals.add(4,"parakeet");
        animals.add(5,"giraffe");
        System.out.println(animals);
        System.out.println("---------------------------------------------------------------------------------");

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        System.out.println("----------------------------------------------------------------------------------");

        // 7. Write a Java program to check if a particular element exists in a linked list.
        System.out.println(animals.contains("penguin"));
        System.out.println("-----------------------------------------------------------------------------------");

        // 8. Write a Java program to convert a linked list to array list.
        List<String> arrayList = new ArrayList<String>(animals);
        for (String i : arrayList) {
        System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------------------");

    }
}
