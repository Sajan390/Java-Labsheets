package com.company;
import java.util.Scanner;
public class EX_08 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter any character or number or special character : ");
        char chara = n.next().charAt(0);
        if (((chara>='a')&& (chara <='z'))||((chara>='A')&&(chara>='B'))){
            System.out.println(chara +" is an alphabet.");
        }
        else if ((chara>='0')&&(chara<='9')){
            System.out.println(chara+" is a number.");
        }
        else
            System.out.println(chara +" is a special character.");
    }
}
