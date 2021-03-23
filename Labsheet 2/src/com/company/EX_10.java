package com.company;
import java.util.Scanner;
import java.lang.Math;
public class EX_10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the three digit number to check if it is ArmStrong or not : ");
        int s, input = n.nextInt();
        int a,b,c;
        s = input;
        a = s % 10;
        s = s / 10;
        b = s % 10;
        s = s / 10;
        c = s % 10;
        double temp = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        if(temp==input){
            System.out.println("ArmStrong Number");
        }
        else
            System.out.println("Not a ArmStrong Number.");
    }
}