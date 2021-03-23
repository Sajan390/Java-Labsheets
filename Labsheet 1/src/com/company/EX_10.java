package com.company;
import java.util.Scanner;
public class EX_10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        float a = n.nextFloat();
        float b = n.nextFloat();
        float sum = a+b, d= a-b, m=a*b, q=a/b, mod=a%b;
        System.out.println(sum+"\n");
        System.out.println(d+"\n");
        System.out.println(m+"\n");
        System.out.println(q+"\n");
        System.out.println(mod);
    }
}
