package com.bridgelabz;
import java.util.regex.Pattern;
public class Validator {
    public static boolean isValidName(String firstName, String lastName) {
        String namePattern = "^[A-Z][a-zA-Z]{2,}$";

        return firstName.matches(namePattern) && lastName.matches(namePattern);
    }
}




