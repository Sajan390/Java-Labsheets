package com.company;
import java.util.Scanner;
public class EX_02 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number to print its multiplication table : ");
        int number = n.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
}
