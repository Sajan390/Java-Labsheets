package com.company;
import java.util.Scanner;
public class EX_11 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the five digit integer : ");
        int f = n.nextInt();
        int a=f%10;
        f/=10;
        int b=f%10;
        f/=10;
        int c=f%10;
        f/=10;
        int d=f%10;
        f/=10;
        int e=f%10;
        int sum = a + b+c+d+e;
        System.out.println("The sum of five digit integer is "+sum+".");
    }
}
