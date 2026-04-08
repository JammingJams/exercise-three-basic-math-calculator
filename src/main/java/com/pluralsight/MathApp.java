package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 12;

        String a = "A";
        String s = "S";
        String m = "M";
        String d = "D";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your letter: ");
        String multname = keyboard.nextLine();

        if (multname.equals("A")) {
            System.out.println(n1 + n2);
        }
        else if (multname.equals("S")) {
            System.out.println(n1 - n2);
        }
        else if (multname.equals("M")) {
            System.out.println(n1 * n2);
        }
        else if (multname.equals("D")) {
            System.out.println(n1 / n2);
        }
        else {
            System.out.println("Invalid response");}
        System.out.println("Thank you for your submission");






    }
}
