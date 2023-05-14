package com.bridgelabz;
import java.util.Scanner;

import static com.bridgelabz.Validator.isValidFirstName;

public class FirstNameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); // Read user input for first name

        if (isValidFirstName(firstName)) { // Call isValidFirstName method to validate the first name
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name!");
        }
    }
}
