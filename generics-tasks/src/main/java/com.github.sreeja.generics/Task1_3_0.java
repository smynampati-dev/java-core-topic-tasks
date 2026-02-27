package com.github.sreeja.generics;

/**
 * Task 1-3-0
 * Generic container class that can store and return any type.
 */
public class Task1_3_0<T> {

    private T data;

    public Task1_3_0(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

    public void set(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Task1_3_0<Integer> number = new Task1_3_0<>(42);
        System.out.println(number.get());

        Task1_3_0<String> text = new Task1_3_0<>("Java Generics");
        System.out.println(text.get());
    }
}
