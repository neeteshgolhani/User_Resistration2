package com.bridgelabz;
public class Validator {
    public static boolean isValidMobileNumber(String mobileNumber) {
        // Regular expression pattern to match the required conditions
        String mobilePattern = "^\\d{2} \\d{10}$";

        return mobileNumber.matches(mobilePattern); // Check if the mobile number matches the pattern
    }
}




