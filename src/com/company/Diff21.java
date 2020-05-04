package com.company;

import java.util.Scanner;

public class Diff21 {

    public static int diff21(int n) {

        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("n = ?");
        int n = in.nextInt();

        diff21(n);

        System.out.println(diff21(n));

    }

}
