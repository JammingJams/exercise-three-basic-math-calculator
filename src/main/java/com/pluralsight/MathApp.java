package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        //int n1 = 5;
        //int n2 = 12;

        String a = "A";
        String s = "S";
        String m = "M";
        String d = "D";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your first number?: ");
        int n1 = keyboard.nextInt();

        System.out.print("What is your second number?: ");
        int n2 = keyboard.nextInt();

        System.out.print("Please enter your operator: ");
        keyboard.nextLine();
        String multname = keyboard.nextLine();


        if (multname.equals("A")) {
            System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
        }
        else if (multname.equals("S")) {
            System.out.printf("%d - %d = %d", n1, n2, n1 - n2);        }
        else if (multname.equals("M")) {
            System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
        }
        else if (multname.equals("D")) {
            System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
        }
        else {
            System.out.println("\nInvalid response");}
        System.out.println("\nThank you for your submission");






    }
}
