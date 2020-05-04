package com.company;

import java.util.Scanner;

public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("A = ?");
        int a = in.nextInt();

        System.out.println("B = ?");
        int b = in.nextInt();

        System.out.println("Is one number negative and the other positive?");
        boolean negative = in.nextBoolean();

        posNeg(a, b, negative);

        System.out.println(posNeg(a, b, negative));

    }

}
