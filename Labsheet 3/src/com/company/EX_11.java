package com.company;

public class EX_11 {
    public static void main(String[] args) {
        int n = 25, a = 1, b = 1;
        for (int i = 1; i < n; i ++) {
            System.out.print(a + "\t");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
