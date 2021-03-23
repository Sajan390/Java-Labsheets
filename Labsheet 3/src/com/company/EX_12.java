package com.company;
import java.util.Scanner;
public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter term value: ");
        int n = input.nextInt();
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.print("1  ");
        for (int i = 1; i < n; i++) {
            System.out.print(Math.pow(x, i) + "  ");
        }
    }
}
