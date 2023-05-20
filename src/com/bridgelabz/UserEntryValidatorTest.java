package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserEntryValidatorTest {

    @Test
    public void testHappyPath() {
        UserEntryValidator validator = new UserEntryValidator();

        // Happy test case with valid entries
        String firstName = "Neetesh";
        String lastName = "Golhani";
        String email = "Ng@gmail.com";
        String mobile = "9898989898";
        String password = "Pass@word123";

        boolean isValid = validator.validateUserEntry(firstName, lastName, email, mobile, password);

        Assert.assertTrue(isValid);
    }

    @Test
    public void testSadPath() {
        UserEntryValidator validator = new UserEntryValidator();

        // Sad test case with invalid entries
        String firstName = "";
        String lastName = "Golhani";
        String email = "Ng@gmail";
        String mobile = "1234";
        String password = "password";

        boolean isValid = validator.validateUserEntry(firstName, lastName, email, mobile, password);

        Assert.assertFalse(isValid);
    }
}
