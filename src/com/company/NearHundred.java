package com.company;

import java.util.Scanner;

public class NearHundred {

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("n = ?");
        int n = in.nextInt();

        nearHundred(n);

        System.out.println(nearHundred(n));

    }
}
