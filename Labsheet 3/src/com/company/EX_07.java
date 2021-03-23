package com.company;
import java.util.Scanner;
public class EX_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer of arbitrary length : ");
        int num = input.nextInt(),sum = 0, temp = 0;
        while (num!=0){
            temp = num%10;
            sum += temp;
            num = num/10;
        }
        System.out.println("The sum is "+sum+".");
    }
}
