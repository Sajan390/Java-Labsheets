package com.company;
import java.util.Scanner;
public class EX_07 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the base of triangle : ");
        float b = n.nextFloat();
        System.out.println("Enter the altitude of triangle : ");
        float l = n.nextFloat();
        float area = l*b;
        System.out.println("The area of triangle is "+area+"." );
    }
}
