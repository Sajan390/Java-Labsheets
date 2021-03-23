package com.company;
import java.util.Scanner;
public class EX_04 {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Enter length of a room : ");
        float l = length.nextFloat();
        Scanner breadth = new Scanner(System.in);
        float b = breadth.nextFloat();
        float area= (l*b),perimeter =(2*(l+b));
        System.out.println("The area of room is "+ area + ".");
        System.out.println("The perimeter of room is " + perimeter + ".");
    }
}
