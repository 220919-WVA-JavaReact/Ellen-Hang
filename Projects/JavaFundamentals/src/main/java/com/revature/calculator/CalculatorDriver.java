package com.revature.calculator;

import java.util.Scanner;


public class CalculatorDriver {
       public static void main(String[] args) {
           boolean end = true;
           while (end) {
               System.out.println("Type '+' for add, '-' for subtract, '*' for multiple, '/' for divide, 'end' to end");
               Scanner operator = new Scanner(System.in);
               String sign = operator.nextLine();

               if (sign.equals("end")) {
                   System.out.println("Thank you for playing :)");
                   break;
                   //I couldn't get it to actually stop here either so I put a break here and used a while loop
               }

            System.out.println("Choose the first value?");
            Scanner value = new Scanner(System.in);
            double value1 = value.nextDouble();

             System.out.println("Choose the second value?");
             double value2 = value.nextDouble();


            if (sign.equals("+")) {
                double sum = value1 + value2;
                System.out.println(sum);
            } else if (sign.equals("-")) {
                double sub = value1 - value2;
                 System.out.println(sub);
             } else if (sign.equals("*")) {
                 double multi = value1 * value2;
                 System.out.println(multi);
             } else if (sign.equals("/")) {
                 double divide = value1 / value2;
                 System.out.println(divide);
             } //else if (sign.equals("end")) {
            //System.out.println("end");
               // couldn't get the input to stop if I wrote 'end' so I decided to place it after the sign operators
        }
    }
}