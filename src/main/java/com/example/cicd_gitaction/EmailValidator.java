package com.example.cicd_gitaction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";



    private final Pattern pattern;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
