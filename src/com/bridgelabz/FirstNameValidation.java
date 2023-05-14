package com.bridgelabz;
import java.util.Scanner;

public class FirstNameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); // Read user input for first name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (Validator.isValidName(firstName, lastName)) {
            System.out.println("Valid name!");
        } else {
            System.out.println("Invalid name!");
        }
    }
}
