package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 5-0-2
 * Convert list of strings to uppercase using map()
 */
public class Task5_0_2 {

    public static List<String> toUpperCase(List<String> words) {
        return words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "streams", "generics", "maven");

        List<String> result = toUpperCase(words);

        System.out.println("Uppercase words: " + result);
    }
}
