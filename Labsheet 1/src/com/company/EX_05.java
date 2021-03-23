package com.company;
import java.util.Scanner;

import static java.lang.Math.PI;

public class EX_05 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        float rad = radius.nextFloat();
        float area = 4*(22/7)*rad*rad, volume = 4/3 * (22/7) * rad * rad *rad ;
        System.out.println("The area of circle is "+area+".");
        System.out.println("The volume of circle is "+volume+".");
    }
}
