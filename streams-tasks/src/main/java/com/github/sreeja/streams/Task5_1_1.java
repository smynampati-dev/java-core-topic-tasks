package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 5-1-1
 * Filter names starting with 'A' and convert to uppercase
 */
public class Task5_1_1 {

    public static List<String> processNames(List<String> names) {

        return names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Alice",
                "Bob",
                "Andrew",
                "David",
                "Anna"
        );

        List<String> result = processNames(names);

        System.out.println("Processed names: " + result);
    }
}
