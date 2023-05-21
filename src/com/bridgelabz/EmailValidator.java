package com.bridgelabz;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void validate(String email) throws InvalidUserDetailsException {
        if (!isValidEmail(email)) {
            throw new InvalidUserDetailsException("Invalid email: " + email);
        }
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }
}
