package com.company;
import java.util.Scanner;
public class EX_08 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the deposited amount : ");
        float p =  n.nextFloat();
        System.out.println("Enter the period of time : ");
        float t = n.nextFloat();
        System.out.println("Enter the rate of interest : ");
        float r = n.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("The amount of simple interest is "+ si+ ".");
    }
}
