package com.company;

import java.util.Scanner;

public class SleepIn {

        public static boolean sleepIn(boolean weekday, boolean vacation) {

                if (!weekday || vacation) {
                    return true;
                }
                return false;
                }

                // Solution notes: better to write "vacation" than "vacation == true"
                // though they mean exactly the same thing.
                // Likewise "!weekday" is better than "weekday == false".
                // This all can be shortened to: return (!weekday || vacation);
                // Here we just put the return-false last, or could use an if/else

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Is it a weekday? (true/false)");


        boolean weekday = in.nextBoolean();
        // find a way to accept Y or N

        System.out.println("Are we on vacation? (true/false)");

        boolean vacation = in.nextBoolean();
        // find a way to accept Y or N


        if (sleepIn(weekday, vacation)){

            System.out.println("We can sleep in");

        } else {

            System.out.println("We can't sleep in.");

        }



    }
}

