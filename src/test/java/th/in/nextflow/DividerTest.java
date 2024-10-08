package th.in.nextflow;

    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;

    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

    public class DividerTest {
        private Divider divider;

        @BeforeEach
        public void setUp() {
            divider = new Divider();
        }

        @Test
        public void testDivideByNonZero() {
            assertEquals(2, divider.divide(4, 2));
        }

        @Test
        public void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> {
                divider.divide(4, 0);
            });
        }
    }