package com.company;
import java.lang.Math;
public class EX_03 {
    public static void main(String[] args) {
        System.out.println("The ArmStrong numbers of three digit are : ");
        for (int i = 100;i<1000;i++){
            int t,a,b,c;
            t = i;
            a = t%10;
            t = t/10;
            b = t%10;
            t = t/10;
            c = t%10;
            if (i==( Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) ) ){
                System.out.println(i);
            }
        }
    }
}
