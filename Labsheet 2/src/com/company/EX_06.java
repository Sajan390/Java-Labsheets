package com.company;
import java.util.Scanner;
public class EX_06 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter four integers : ");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        int d = n.nextInt();
        int temp=0;
        if (a>temp)
            temp = a;
        if (b>temp)
            temp = b;
        if (c>temp)
            temp = c;
        if (d>temp)
            temp = d;
        System.out.println("The maximum value is "+temp+".");
    }
}

