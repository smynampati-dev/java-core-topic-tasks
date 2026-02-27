package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Task 5-3-1
 * Find sum using reduce()
 */
public class Task5_3_1 {

    public static int sum(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int result = sum(numbers);

        System.out.println("Sum: " + result);
    }
}
