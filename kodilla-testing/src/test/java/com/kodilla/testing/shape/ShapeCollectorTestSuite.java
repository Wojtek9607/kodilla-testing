package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println(
                "Prepare to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Figures collection.")
    class TestShapes {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle1 = new Circle("circle1", 1);
            //When
            collector.addFigure(circle1);
            Shape expected = collector.getFigure(0);
            //Then
            Assertions.assertEquals(expected, circle1);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle1 = new Circle("circle1", 1);
            collector.addFigure(circle1);
            //When
            collector.removeFigure(circle1);
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(null, result);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle1 = new Circle("circle1", 1);
            collector.addFigure(circle1);
            Shape square1 = new Square("square1", 5);
            collector.addFigure(square1);
            Shape triangle1 = new Triangle("triangle1", 2, 2, 2);
            collector.addFigure(triangle1);
            //When
            Shape expected = collector.getFigure(2);
            //Then
            Assertions.assertEquals(expected, triangle1);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle1 = new Circle("circle1", 1);
            collector.addFigure(circle1);
            Shape square1 = new Square("square1", 5);
            collector.addFigure(square1);
            Shape triangle1 = new Triangle("triangle1", 2, 2, 2);
            collector.addFigure(triangle1);
            //When
            String result = collector.showFigures();
            //Then
            Assertions.assertEquals("circle1, square1, triangle1.", result);
        }
    }
}
