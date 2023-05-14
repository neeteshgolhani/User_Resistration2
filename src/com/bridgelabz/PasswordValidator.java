package com.bridgelabz;
public class PasswordValidator {
    public static boolean isPasswordValid(String password) {
        // Check if the password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        return password.matches(".*[A-Z].*");
    }
}





