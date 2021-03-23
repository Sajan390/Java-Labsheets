package com.company;
import java.util.Scanner;
public class EX_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x and n respectively: ");
        int x = input.nextInt();
        int n = input.nextInt();

        double sum = x;

        System.out.print("\n\nSeries:\n" + x);

        for (int i = 2; i < n; i++) {
            double term = Math.pow(-1, i) * (i / Math.pow(x, i));
            System.out.print(" + " + term);
            sum += term;
        }

        System.out.println("\nSum is " + sum);
    }
}
