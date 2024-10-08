package th.in.nextflow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        // Clean up resources if needed
        calculator = null;
    }

    @Test
    public void testAddPositiveNumbers() {
        calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAddWithZero() {
        calculator = new Calculator();
        assertEquals(2, calculator.add(2, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testIsEven(int number) {
        assertTrue(calculator.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testIsNotEven(int number) {
        assertFalse(calculator.isEven(number));
    }

    @ParameterizedTest(name = "Add {0} to {1} equals {2}")
    @CsvSource({
        "1, 1, 2",
        "2, 3, 5",
        "-1, -1, -2",
        "0, 5, 5"
    })
    public void testAdd(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @ParameterizedTest(name = "Multiply {0} by {1} equals {2}")
    @CsvSource({
        "1, 1, 1",
        "2, 3, 6",
        "-1, -1, 1",
        "0, 5, 0"
    })
    public void testMultiply(int a, int b, int expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }
}
