package com.bridgelabz;
import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine(); // Read user input for email address

        if (Validator.isValidEmail(email)) { // Call isValidEmail method to validate the email address
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address!");
        }
    }
}