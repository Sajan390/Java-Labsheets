package com.company;
import java.util.Scanner;
public class EX_11 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the sales of A : ");
        int sA = n.nextInt();
        System.out.println("Enter the sales of B : ");
        int sB = n.nextInt();
        if (sA <= 2000) {
            double rate = sA * 0.05;
            System.out.println("The net commission of A is " + rate + ".");
        } else {
            double rate = sA * 0.06;
            System.out.println("The net commission of A is " + rate + ".");
        }
        if (sB <= 4000) {
            double rate = sB * 0.1;
            System.out.println("The net commission of B is " + rate + ".");
        } else {
            double rate = sB * 0.12;
            System.out.println("The net commission of B is " + rate + ".");
        }
    }
}
