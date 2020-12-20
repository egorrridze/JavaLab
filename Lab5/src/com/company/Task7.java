package com.company;

import java.util.Scanner;

public class Task7 {
    static void multipliers(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    multipliers(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        multipliers(n);

    }
}
