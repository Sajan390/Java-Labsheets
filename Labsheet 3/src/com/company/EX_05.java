package com.company;
import java.util.Scanner;
public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b=0, c=0, d=0;
        System.out.println("Enter ages of 15 persons : ");
        for (int i=1; i<=15; i++){
            int age = input.nextInt();
            if ((age>=0)&& (age<=5)){
                b++;
            }
            else if ((age>=6)&&(age<=17)){
                c++;
            }
            else{
                d++;
            }
        }
        System.out.println(b+" Still a baby");
        System.out.println(c+" Attending School");
        System.out.println(d+" Adult life");
    }
}
