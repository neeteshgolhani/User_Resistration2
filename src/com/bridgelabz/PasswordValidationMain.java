package com.bridgelabz;
public class PasswordValidationMain {
    public static void main(String[] args) {
        String password = "Pass@word";
        if (PasswordValidator.isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It should have at least 8 characters, contain at least one uppercase letter, at least one numeric digit, and exactly one special character.");
        }
    }
}