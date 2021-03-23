package com.company;
import java.util.Scanner;
import java.lang.Math;
public class EX_07 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        System.out.println("1.\tSummation\n" +
                "2.\tSum of squares\n" +
                "3.\tSum of cubes\n" +
                "4.\tProduct \n");
        System.out.println("Enter the task number : ");
        int s = n.nextInt();
        switch (s){
            case 1:
                double sum = a+b+c;
                System.out.println("The sum of three numbers is "+sum+".");
                break;
            case 2:
                double square = Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2);
                System.out.println("The sum of squares is "+square+".");
            case 3:
                double cube = Math.pow(a,3) + Math.pow(b,3) + Math.pow(c, 3);
                System.out.println("The sum of cubes is "+cube+ ".");
                break;
            case 4:
                double product = a*b*c;
                System.out.println("The product of three number is "+product+".");
                break;
        }
    }
}
