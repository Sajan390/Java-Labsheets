package com.company;
import java.util.Scanner;
public class EX_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first character: ");
        char ch = scan.next().charAt(0);
        System.out.println("Enter second character: ");
        char ch2 = scan.next().charAt(0);
        int count=0;
        for(int c =ch; c<=ch2; c++){
            count++;
        }
        System.out.println("The number of character between " + ch + " and " + ch2 + "is: " + (count-2));

    }
}

