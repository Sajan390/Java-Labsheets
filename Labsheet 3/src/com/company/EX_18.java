package com.company;
import java.util.Scanner;
public class EX_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        do{
            int m1,m2,m3;
            System.out.println("Enter the marks of students in three subjects: ");
            m1 = scan.nextInt();
            m2 = scan.nextInt();
            m3 = scan.nextInt();
            int total = m1 + m2 + m3;
            float percent = ((float)(m1+m2+m3)/300)*100;
            System.out.println("The total and percentage is: " + total + " and " + percent);
            System.out.println("Do you wish to continue? ");
            ch = scan.next().charAt(0);
            ch = Character.toLowerCase(ch);
        }while(ch=='y');
        System.out.println("Thank You! ");
    }
}

