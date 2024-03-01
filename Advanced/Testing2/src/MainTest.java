import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Testing if the methods return expected result, and that the methods don't break if null is passed

    private final Main testing = new Main();
    ZonedDateTime dateZoned = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
    OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    void returnFullDate() {
        String actual = testing.returnFullDate(dateZoned);
        assertEquals("venerdì 1 marzo 2002 13:00:00 Z", actual, "Dates should be the same, formatted in FULL");
    }

    @Test
    void returnNullFullDate() {
        String actual = testing.returnFullDate(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void returnMediumDate() {
        String actual = testing.returnMediumDate(date);
        assertEquals("1 mar 2002, 13:00:00", actual, "Dates should be the same, formatted in MEDIUM");
    }

    @Test
    void returnNullMediumDate() {
        String actual = testing.returnMediumDate(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void returnShortDate() {
        String actual = testing.returnShortDate(date);
        assertEquals("01/03/02, 13:00", actual, "Dates should be the same, formatted in SHORT");
    }

    @Test
    void returnNullShortDate() {
        String actual = testing.returnShortDate(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }
}