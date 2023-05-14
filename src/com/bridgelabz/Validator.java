package com.bridgelabz;
public class Validator {
     public static boolean isValidEmail(String email) {
         // Regular expression pattern to match the required conditions
         String emailPattern = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z]{2,}){1,2}$";

         return email.matches(emailPattern); // Check if the email address matches the pattern
     }
}




