package th.in.nextflow;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofSeconds;

import org.junit.jupiter.api.Test;

public class WebApiClientTest {
    @Test
    public void testCallWebApiTimeout() {
        WebApiClient client = new WebApiClient();
        assertThrows(AssertionError.class, () -> {
            assertTimeout(ofSeconds(3), () -> {
                client.callWebApi();
            });
        });
    }

    @Test
    public void testCallWebApiNoTimeout() {
        WebApiClient client = new WebApiClient();
        assertTimeout(ofSeconds(6), () -> {
            client.callWebApi();
        });
    }
}