package com.company;

import java.util.Scanner;

public class Makes10 {

    public static boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || a+b == 10);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("A = ?");
        int a = in.nextInt();

        System.out.println("B = ?");
        int b = in.nextInt();
        makes10(a, b);

        System.out.println(makes10(a, b));

    }
}
