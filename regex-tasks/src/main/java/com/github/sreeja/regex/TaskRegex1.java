package com.github.sreeja.regex;

import java.util.regex.Pattern;

/**
 * Regex task
 * Validate email using regex
 */
public class TaskRegex1 {

    public static boolean isValidEmail(String email) {

        String regex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {

        String email1 = "test@gmail.com";
        String email2 = "invalid-email";

        System.out.println(email1 + " valid: " +
                isValidEmail(email1));

        System.out.println(email2 + " valid: " +
                isValidEmail(email2));
    }
}
