package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test remove odd numbers: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test remove odd numbers: end");
    }

    @DisplayName(
            "When empty list is given message " +
                    "'There were no even numbers in provided list.' is produced"
    )

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new LinkedList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        List<Integer> expected = new LinkedList<>();
        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName(
            "When list with numbers is given only even numbers are printed"
    )

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new LinkedList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        for (int i = 0; i<9; i++) {
            numbers.add(i+30);
        }
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        List<Integer> expected = new LinkedList<>();
        expected.add(30);
        expected.add(32);
        expected.add(34);
        expected.add(36);
        expected.add(38);
        //Then
        Assertions.assertEquals(expected,result);
    }
}


