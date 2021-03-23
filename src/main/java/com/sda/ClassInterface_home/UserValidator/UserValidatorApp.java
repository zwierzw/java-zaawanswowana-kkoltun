package com.sda.ClassInterface_home.UserValidator;

public class UserValidatorApp {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("Malpa23@gmail.com", "Kolos094@wp.pl");
        System.out.println(results[0]);
        System.out.println(results[1]);

    }
}
