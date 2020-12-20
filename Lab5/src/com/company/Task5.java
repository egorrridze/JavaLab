package com.company;

import java.util.Scanner;

public class Task5 {
    private static int sum = 0;
    private static void check(int n) {
        if (n / 10 != 0) {
            sum+=n % 10;
            n /= 10;
            check(n);
        } else {
            sum+=n;
        }
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            check(in.nextInt());
            System.out.println(sum);
        }
    }
