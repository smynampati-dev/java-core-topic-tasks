package com.github.sreeja.generics;

/**
 * Task 1-3-2
 * Bounded generic type example (only Numbers allowed)
 */
public class Task1_3_2<T extends Number> {

    private T number;

    public Task1_3_2(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {

        Task1_3_2<Integer> intObj = new Task1_3_2<>(5);
        Task1_3_2<Double> doubleObj = new Task1_3_2<>(3.5);

        System.out.println("Square of 5: " + intObj.square());
        System.out.println("Square of 3.5: " + doubleObj.square());

        // ❌ This would cause compile error:
        // Task1_3_2<String> obj = new Task1_3_2<>("Hello");
    }
}
