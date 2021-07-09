package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultCalculator = calculator.add(5,8);
        int resultCalculator2 = calculator.substract(20,15);

        if (resultCalculator == 13) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (resultCalculator2 == 5) {
            System.out.println("test 2 OK");
        } else {
            System.out.println("Error");
        }
    }
}


