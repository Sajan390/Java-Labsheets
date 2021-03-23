package com.company;
import java.util.Scanner;
public class EX_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int decimal = input.nextInt();
        int rem,t=decimal;
        String octal ="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        while(decimal>0)
        {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        System.out.println("The octal of "+t+" is "+octal+".");
    }
}
