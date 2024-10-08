package th.in.nextflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {
    private static Counter counter;

    @BeforeEach
    public void setUp() {
        counter = new Counter();
    }

    @AfterEach
    public void tearDown() {
        counter = null;
    }

    @Test
    public void testIncrementOnce() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void testIncrementTwice() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
    }

    @Test
    public void testIncrementThrice() {
        counter.increment();
        counter.increment();
        counter.increment();
        assertEquals(3, counter.getCount());
    }
}