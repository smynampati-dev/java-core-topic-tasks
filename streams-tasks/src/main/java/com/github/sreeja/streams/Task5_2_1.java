package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 5-2-1
 * Sort numbers using streams
 */
public class Task5_2_1 {

    public static List<Integer> sortNumbers(List<Integer> numbers) {

        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 3, 7, 1, 5, 2, 8);

        List<Integer> sorted = sortNumbers(numbers);

        System.out.println("Sorted numbers: " + sorted);
    }
}
