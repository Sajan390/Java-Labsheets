package com.company;
import java.util.Scanner;
public class EX_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int number = input.nextInt();
        int j=4;
        for (int i = 1;i<=number;i++){
            System.out.println(i+"*"+j+",");
            j+=3;
        }
    }
}
