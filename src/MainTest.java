import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    //Testing if the methods return expected result, and that the methods don't break if null is passed

    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    OffsetDateTime dateModified = date.plusYears(1).minusMonths(1).plusDays(7);


    @Test
    void returnLocalizedDateUnmodified() {
        String result = testing.returnLocalizedDateUnmodified(date);
        assertEquals("1 mar 2023, 13:00:00", result, "The unmodified localized dateTime should be the same");
    }

    @Test
    void returnLocalizedDateUnmodifiedIfNull() {
        String actual = testing.returnLocalizedDateUnmodified(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void returnLocalizedDateModified() {
        String result = testing.returnLocalizedDateModified(dateModified);
        assertEquals("8 feb 2024, 13:00:00", result, "The modified localized dateTime should be the same");
    }

    @Test
    void returnLocalizedDateModifiedIfNull() {
        String actual = testing.returnLocalizedDateModified(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }
}