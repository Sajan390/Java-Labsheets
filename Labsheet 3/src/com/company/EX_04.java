package com.company;
import java.util.Scanner;
public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,sum =0;
        System.out.println("Enter ages of 15 persons : ");
        for (int i=1; i<=15;i++){
            int age = input.nextInt();
            if (age<min){
                min = age;
            }
            if (age>max){
                max = age;
            }
            sum += age;
        }
        System.out.println("The minimum age is "+min+".");
        System.out.println("The maximum age is "+max+".");
        System.out.println("The average age of 15 persons is "+(float)sum/15+".");
    }
}
