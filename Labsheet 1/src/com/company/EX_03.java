package com.company;
import java.util.Scanner;
public class EX_03 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter age of person : ");
        int ag = age.nextInt();
        int age_in_days;
        age_in_days = ag * 365;
        System.out.println("The age in days of person is " + age_in_days+ ".");
    }
}
