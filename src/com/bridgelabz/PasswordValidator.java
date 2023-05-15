package com.bridgelabz;
public class PasswordValidator {
    public static boolean isPasswordValid(String password) {
        // Check if the password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if the password contains at least one numeric digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Check if the password has exactly one special character
        int specialCharCount = password.length() - password.replaceAll("[^!@#$%^&*(gi)]", "").length();
        return specialCharCount == 1;
    }
}
