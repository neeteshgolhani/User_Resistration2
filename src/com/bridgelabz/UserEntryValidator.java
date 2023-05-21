package com.bridgelabz;

public class UserEntryValidator {
    public static void main(String[] args) {
        String firstName = "Neetesh";
        String lastName = "Golhani";
        String email = "Neetesh@example.com";
        String mobile = "1234567890";
        String password = "Abc@123";

        try {
            validateFirstName(firstName);
            validateLastName(lastName);
            validateEmail(email);
            validateMobile(mobile);
            validatePassword(password);

            System.out.println("All user details are valid.");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Invalid user details: " + e.getMessage());
        }
    }

    public static void validateFirstName(String firstName) throws InvalidUserDetailsException {
        if (!firstName.matches("[A-Za-z]+")) {
            throw new InvalidUserDetailsException("Invalid first name");
        }
    }

    public static void validateLastName(String lastName) throws InvalidUserDetailsException {
        if (!lastName.matches("[A-Za-z]+")) {
            throw new InvalidUserDetailsException("Invalid last name");
        }
    }

    public static void validateEmail(String email) throws InvalidUserDetailsException {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidUserDetailsException("Invalid email");
        }
    }

    public static void validateMobile(String mobile) throws InvalidUserDetailsException {
        if (!mobile.matches("\\d{10}")) {
            throw new InvalidUserDetailsException("Invalid mobile number");
        }
    }

    public static void validatePassword(String password) throws InvalidUserDetailsException {
        if (!password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            throw new InvalidUserDetailsException("Invalid password");
        }
    }
}

