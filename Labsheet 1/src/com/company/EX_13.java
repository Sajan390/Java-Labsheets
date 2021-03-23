package com.company;
import java.lang.Math;
public class EX_13 {
    public static void main(String[] args) {
        double a= 2.9678*Math.pow(10,-27);
        double b= 0.876*Math.pow( 10, -38);
        double c=7.025*Math.pow(10, 16);
        double d=9.75*Math.pow(10,12);
        double f=(a+b)/(c-d);
        System.out.println(f);
    }
}