package com.sda.ClassInterface_home.UserValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public String[] validateEmails(String email, String alternativeEmail) {

        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !matcherChecker(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email, email2.email};
    }

    public static final Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@([A-Z0-9.-]+)\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean matcherChecker (String emailStr){
        Matcher matcher = pattern.matcher(emailStr);
        return matcher.find();
    }
}
