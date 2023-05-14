package com.bridgelabz;
import java.util.Scanner;
public class MobileNumberValidation {
    public static void main(String[] args) {
        String password = "MyPass123";
        if (PasswordValidator.isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It should have at least 8 characters.");
        }
    }
}