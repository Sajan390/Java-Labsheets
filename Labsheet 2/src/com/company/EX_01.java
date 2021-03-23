//1.	Write a program to calculate and print compound interest amount (f) when p,n,r are given (Formula :
//f = p x (l +r)n, r should be given in decimal like. (r = 0.15)
package com.company;
import java.util.Scanner;
import java.lang.Math;
public class EX_01 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        int p = i.nextInt();
        System.out.println("Enter the time in years : ");
        float n = i.nextFloat();
        System.out.println("Enter the rate : ");
        float r = i.nextFloat();
        double f = p *  Math.pow((1+r), n);
        double interest  = f - p;
        System.out.println("The compound interest is "+interest+".");
        System.out.println("The compound amount for given principal is " + f+".");
    }
}
