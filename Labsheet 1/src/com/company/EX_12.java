package com.company;
import java.util.Scanner;
public class EX_12 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter five digit number : ");
        int num= n.nextInt();
        int rem,rev=0;
        while (num!=0){
            rem=num%10;
            rev = rev*10+rem;
            num/=10;
        }
        System.out.println("The reversed number is "+rev+".");
    }
}
