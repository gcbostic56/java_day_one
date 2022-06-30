package com.win.junit;
import java.util.Scanner;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Get used to doing this! First things first, create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("What year is it? ");

        // The integer provided by the user will be assigned to the year variable
        // Scanner will read the input entered by the user
        int year = scanner.nextInt();

        // Print the value that the user assigned to the year variable
        System.out.println(year);
    }
}