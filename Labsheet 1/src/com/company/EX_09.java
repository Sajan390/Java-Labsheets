package com.company;
import java.util.Scanner;
public class EX_09 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        float a = n.nextFloat();
        float b = n.nextFloat();
        float c = n.nextFloat();
        float d = n.nextFloat();
        float s = a+b+c+d;
        float ap = (a/s)*100;
        float bp = (b/s)*100;
        float cp = (c/s)*100;
        float dp = (d/s)*100;
        System.out.println("The percentage of a, b, c and d are "+a+ ", " +b+ ", " +c+ " and " +d+ " " +"repestively.");
    }
}
