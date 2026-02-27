package com.github.sreeja.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 5-0-1
 * Filter even numbers using Java Streams
 */
public class Task5_0_1 {

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evens = getEvenNumbers(numbers);

        System.out.println("Even numbers: " + evens);
    }
}
