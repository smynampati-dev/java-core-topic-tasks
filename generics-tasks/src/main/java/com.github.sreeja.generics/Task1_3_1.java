package com.github.sreeja.generics;

/**
 * Task 1-3-1
 * Generic method that works with any type.
 */
public class Task1_3_1 {

    // generic method
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    // generic method returning value
    public static <T> T getFirst(T a, T b) {
        return a;
    }

    public static void main(String[] args) {

        printValue(100);
        printValue("Hello");
        printValue(3.14);

        Integer result = getFirst(10, 20);
        String text = getFirst("Java", "Python");

        System.out.println("First integer: " + result);
        System.out.println("First string: " + text);
    }
}
