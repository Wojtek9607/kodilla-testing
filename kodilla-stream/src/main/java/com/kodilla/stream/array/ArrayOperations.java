package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        System.out.println("The table content are following numbers:");
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .average().getAsDouble();
        System.out.println("The average value from table is: " + average);
        return average;
    }
}
