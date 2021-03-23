package com.company;
import java.util.Scanner;
public class EX_12 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the deposited amount : ");
        double deposit = n.nextFloat();
        System.out.println("Enter the time in years : ");
        double time = n.nextFloat();
        double rate;
        if ((time>=2)&& (deposit<1000)){
            rate = 0.05;
        }
        else if ((time>=2)&&(deposit>=1000)&&(deposit<5000)){
            rate = 0.07;
        }
        else if ((time>=1)&&(deposit>=5000)){
            rate = 0.08;
        }
        else if (time>=5){
            rate = 0.1;
        }
        else{
            rate = 0.03;
        }
        double compund_interest = deposit *  Math.pow((1+rate), time);
        System.out.println("The compund interest of "+deposit+" in time "+time+" year is "+compund_interest+".");
        System.out.println("Total amount is "+(compund_interest+deposit));
    }
}
