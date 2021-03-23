package com.company;
import java.util.Scanner;
public class EX_09 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the average temperature of the day in 'Fahrenheit' : ");
        float temperature = n.nextFloat();
        String as = (temperature>=80) ? "Hot day" : ((temperature>60) && (temperature<80)) ? "Nice day" :
                (temperature<=60) ? "Cold day" : null;
        System.out.println(as);
    }
}
