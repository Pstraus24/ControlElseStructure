// Write a program that has a variable named temperature and assign a value of between 92.0 and 104.0 to it.
// Get the temperature from the user.
// Using an else structure, determine if the temperature is low (below 97.5), normal (between 97.5 and 99.5
// ) or high (over 99.5). Display to the screen text that indicates what the temperature is, and if it is high,
// low, or normal. Make sure to test the program with each of the three possible value ranges to make sure that
// it works.


package com.company;

import java.util.Scanner;// import package for user input

public class Main {

    public static void main(String[] args) {
        // initialize variables
        double user_input;
        double temperature = 98.5;// define temperature per assignment.  Why is this needed?
        String result;// result used for text based on user input

        Scanner scanner = new Scanner(System.in);// call scanner for user input

        System.out.println("Enter the temperature: ");// prompt user for any temperature
        user_input = scanner.nextDouble();

// if/else structure to determine variable=result value
        if (user_input < 97.5) {
            result = "Low";
        }

        else if(user_input > 99.5){
            result = "High";
        }

        else {
            result = "Normal";
        }
// End of if/else structure

        System.out.println("The entered temperature of " + user_input + " is " + result);
        System.out.println("The actual temperature is " + temperature);// display temperature?
    }
}

//Comment to check GitHub commit