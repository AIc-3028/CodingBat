package com.company;

import java.util.Scanner;

public class MonkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Is Monkey A smiling?");
        boolean aSmile = in.nextBoolean();
        // find a way to accept Y or N

        System.out.println("Is Monkey B smiling?");
        boolean bSmile = in.nextBoolean();
        // find a way to accept Y or N


        if (monkeyTrouble(aSmile, bSmile)) {

            System.out.println("We are in trouble.");

        } else {

            System.out.println("We are fine.");

        }
    }
}
