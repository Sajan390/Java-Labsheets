package com.company;
import java.util.Scanner;
public class EX_06 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the degree in Celsius : ");
        float deg = n.nextFloat();
        float fahren = ((deg * 1.8f)+32) ;
        System.out.println("The degree in fahrenheit is " +fahren+ ".");
    }
}
