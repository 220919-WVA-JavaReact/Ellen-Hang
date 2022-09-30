package com.revature.calculator;


import java.util.Scanner;

public class CalculatorDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.println("Type either add, subtract, multiple, divide");
        if (choice.equals("add")) {
            System.out.println("add");
        } else if (choice.equals("subtract")) {
            System.out.println("subtract");
            break;
        }
    }
}
