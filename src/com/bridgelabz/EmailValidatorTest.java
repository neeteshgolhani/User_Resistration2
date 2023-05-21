package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void testValidEmails(String emailAddress) {
        try {
            EmailValidator.validate(emailAddress);
            // If no exception is thrown, the email is considered valid
            Assertions.assertTrue(true);
        } catch (InvalidUserDetailsException e) {
            // Exception should not be thrown for valid emails
            Assertions.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    })
    public void testInvalidEmails(String emailAddress) {
        try {
            EmailValidator.validate(emailAddress);
            // If no exception is thrown, the email is considered invalid
            Assertions.fail("Expected exception for invalid email: " + emailAddress);
        } catch (InvalidUserDetailsException e) {
            // Exception is expected for invalid emails
            Assertions.assertTrue(true);
        }
    }
}