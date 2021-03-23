package com.company;
import java.util.Scanner;
public class EX_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to compute factorial : ");
        int n = input.nextInt();
        int fact=1;
        for (int i=0; i<n;i++){
            fact = fact* (n-i);
        }
        System.out.println(fact);
    }
}
