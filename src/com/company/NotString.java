package com.company;

import java.util.Scanner;

public class NotString {

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("Not")) {
            return str;
        }

        return "Not " + str;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Tell Me something cool.");
        String str = in.nextLine();

        notString(str);

        System.out.println(notString(str));

    }

}
