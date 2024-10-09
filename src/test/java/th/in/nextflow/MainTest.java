package th.in.nextflow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMain() {
        // Capture the output of the main method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the main method
        Main.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Hello world!\n2 + 3 = 5\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
