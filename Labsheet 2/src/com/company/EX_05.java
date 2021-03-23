//5.   Write a program to read three sides of triangle and print area for valid data and to print “Invalid data”
// if either one side of the triangle is greater or equals to the sum of other two sides.
package com.company;
import java.util.Scanner;
import java.lang.Math;
public class EX_05 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle : ");
        double a = n.nextDouble();
        double b = n.nextDouble();
        double c = n.nextDouble();
        double s = (a+b+c)/2;
        if((a>=(b+c)) || (b>=(a+c)) || (c>=(b+a)) ){
            System.out.println("Invalid data");
        }
        else {
            double area = Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
            System.out.println("The area of triangle is " + area + ".");
        }
    }
}
