package com.company;
//8.	To find out decimal equivalent of a given octal number of arbitrary length.
import java.util.Scanner;
public class EX_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the octal number of arbitrary length : ");
        int octal = input.nextInt();
        int decimal = 0,n = 0,t=octal;
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }
        System.out.println("The decimal of " +t+" is "+decimal+".");
    }
}

