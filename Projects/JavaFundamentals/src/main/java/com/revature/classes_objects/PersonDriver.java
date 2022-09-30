package com.revature.ClassesObjects;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class PersonDriver {

    /*
    I'm going to use the main method in this PersonDriver class to call upon my Person class and create person objects.

     */
    public static void main(String[] args) {
        // Any logic we write here will be the logic done when we run the program

        // Declare a primitive value
        int num = 9;

        // Declaring an object is slightly different
        Person bryan = new Person( "Bryan",  71.75,  250.5, 25);
        // Don't need to write in the variables, the variables will pop up when you start writing in the information

        System.out.println(bryan.height);

        System.out.println(bryan.name);

        Person kaitlyn = new Person( "Kaitlyn", 68.5, 135.6, 24);

        System.out.println(kaitlyn.weight);

        bryan.walk(5); // do not need to put in system.out because it was already in the system.out

        kaitlyn.talk();

        System.out.println(kaitlyn.talk());

        Person jimmy = new Person();

        System.out.println(jimmy.weight);

        Person kyle = new Person("Kyle");

        System.out.println(kyle.weight);

        System.out.println(jimmy.name);

        System.out.println(kyle.name);

        // We can reassign the variables given in this case
        jimmy.name = "Jimmy";

        System.out.println(jimmy.name);
    }



}
