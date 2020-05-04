package com.company;

import java.util.Scanner;

public class SumDouble {

    public static int sumDouble(int a, int b) {

        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("A = ?");
        int a = in.nextInt();

        System.out.println("B = ?");
        int b = in.nextInt();
        sumDouble(a, b);

        System.out.println(sumDouble(a, b));

    }
}
