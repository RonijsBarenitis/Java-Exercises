import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    //Testing if the methods return expected result, and that the methods don't break if null is passed

    @Test
    void doesThisReturnYear() {
        String result = testing.returnYear(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("2023", result, "The years should be the same");
    }

    @Test
    void doesThisReturnYearIfNull() {
        String actual = testing.returnYear(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void doesThisReturnMonth() {
        String result = testing.returnMonth(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("MARCH", result, "The months should be the same");
    }
    @Test
    void doesThisReturnMonthIfNull() {
        String actual = testing.returnMonth(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void doesThisReturnDay() {
        String result = testing.returnDay(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("1", result, "The numbers of day should be the same");
    }

    @Test
    void doesThisReturnDayIfNull() {
        String actual = testing.returnDay(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }

    @Test
    void returnDayOfWeek() {
        String result = testing.returnDayOfWeek(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("WEDNESDAY", result, "The days of the week should be the same");
    }

    @Test
    void doesThisReturnDayOfWeekIfNull() {
        String actual = testing.returnDayOfWeek(null);
        assertNull(actual, "If the date passed is null, the result should be null");
    }
}