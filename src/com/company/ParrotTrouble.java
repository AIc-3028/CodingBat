package com.company;

import java.util.Scanner;

public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Is the Parrot talking?");
        boolean talking = in.nextBoolean();
        // find a way to accept Y or N

        System.out.println("What time is it?");
        int hour = in.nextInt();


        parrotTrouble(talking, hour);

        if (parrotTrouble(talking, hour)){

            System.out.println("We are in Trouble");
        } else {
            System.out.println("We are not in Trouble.");
        }
    }

}
