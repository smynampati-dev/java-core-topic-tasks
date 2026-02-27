package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Task 5-4-1
 * Count occurrences of each word
 */
public class Task5_4_1 {

    public static Map<String, Long> countWords(List<String> words) {

        return words.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "java",
                "stream",
                "java",
                "maven",
                "stream",
                "java"
        );

        Map<String, Long> result = countWords(words);

        System.out.println("Word count: " + result);
    }
}
