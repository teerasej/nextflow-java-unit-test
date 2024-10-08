package th.in.nextflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

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
}
