package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(9.5, average);
    }
}
