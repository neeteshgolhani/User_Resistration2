package com.bridgelabz;
import java.util.Scanner;
public class MobileNumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (Validator.isValidMobileNumber(mobileNumber)) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number!");
        }
    }
}