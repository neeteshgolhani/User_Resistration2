package com.bridgelabz;
import java.util.regex.Pattern;
public class Validator {
    static boolean isValidFirstName(String firstName) {
        // Regular expression pattern to match the required conditions
        String pattern = "^[A-Z][a-zA-Z]{2,}$";

        return Pattern.matches(pattern, firstName); // Check if the first name matches the pattern
    }
}
