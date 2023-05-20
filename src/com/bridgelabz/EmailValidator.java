package com.bridgelabz;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validate(String emailAddress) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailAddress).matches();
    }
}
