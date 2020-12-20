package com.company;

import java.util.Scanner;

public class Task6 {
    public static boolean isSimle(int n, int i) {
        if (n <= 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return isSimle(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isSimle(n, 2) ? "Простое" : "Составное");
    }
}
