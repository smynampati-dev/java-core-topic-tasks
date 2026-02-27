package com.github.sreeja.regex;

import java.util.regex.Pattern;

/**
 * Regex task
 * Validate phone numbers (10 digits)
 */
public class TaskRegex2 {

    public static boolean isValidPhone(String phone) {

        String regex = "^[0-9]{10}$";

        return Pattern.matches(regex, phone);
    }

    public static void main(String[] args) {

        String phone1 = "9876543210";
        String phone2 = "12345abc";

        System.out.println(phone1 + " valid: " +
                isValidPhone(phone1));

        System.out.println(phone2 + " valid: " +
                isValidPhone(phone2));
    }
}
