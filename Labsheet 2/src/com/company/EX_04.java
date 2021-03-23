package com.company;
import java.util.Scanner;
public class EX_04 {
    public static void main(String[] args) {
        Scanner n  = new Scanner(System.in);
        System.out.println("Enter length of room : ");
        int l = n.nextInt();
        System.out.println("Enter breadth of room : ");
        int b = n.nextInt();
        int Area = l*b;
        String a = "Small room";
        String B = "Big room";
        String c = "Hall";
        String d = "Auditorium";

        String area = (Area<=150) ? a : ((Area>150) && (Area<500)) ? B : ((Area >=500) && (Area<=2500)) ?
                c : (Area > 2500)? d: null;
        System.out.println(area);
    }
}
