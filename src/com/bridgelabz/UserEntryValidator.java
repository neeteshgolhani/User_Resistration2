package com.bridgelabz;

import java.util.regex.Pattern;

public class UserEntryValidator {
    public boolean validateUserEntry(String firstName, String lastName, String email, String mobile, String password) {
        // Check if all user entry fields are valid
        return isValidFirstName(firstName) && // Check if the first name is valid
                isValidLastName(lastName) && // Check if the last name is valid
                isValidEmail(email) && // Check if the email is valid
                isValidMobile(mobile) && // Check if the mobile number is valid
                isValidPassword(password); // Check if the password is valid
    }

    private boolean isValidFirstName(String firstName) {
        // Check if the first name is not empty
        return !firstName.isEmpty();
    }

    private boolean isValidLastName(String lastName) {
        // Check if the last name is not empty
        return !lastName.isEmpty();
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        // Check if the email matches the specified regex pattern
        return Pattern.matches(emailRegex, email);
    }

    private boolean isValidMobile(String mobile) {
        String mobileRegex = "^[0-9]{10}$";
        // Check if the mobile number matches the specified regex pattern
        return Pattern.matches(mobileRegex, mobile);
    }

    private boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        // Check if the password matches the specified regex pattern
        return Pattern.matches(passwordRegex, password);
    }
}