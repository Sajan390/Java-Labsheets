package com.company;
import java.util.Scanner;
public class EX_03 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the year to check whether it is leap year or not : ");
        int y = n.nextInt();
        if((y%4)==0){


            if (((y%100)==0)&&((y%400)==0)) {
                System.out.println("The year " + y + " is a leap year.");
            }
            else
                System.out.println("The year "+y+" is not a leap year.");
        }
        else
            System.out.println("The year "+y+" is not a leap year.");
    }
}
