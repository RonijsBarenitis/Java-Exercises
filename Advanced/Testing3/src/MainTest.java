import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Testing if the method return expected result, and that the method doesn't break if null is passed

    private final Main testing = new Main();
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void returnDate() {
        String actual = testing.returnDate(date);
        assertEquals("01 marzo 2023", actual, "Dates should be the same");
    }

    @Test
    void returnDateIfNull() {
        String actual = testing.returnDate(null);
        assertNull(actual, "If null is passed, the function should return null");
    }
}