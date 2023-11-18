import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    //Testing if sumArr returns expected result, and that the method doesn't break if null is passed

    @Test
    void returnProperSumArr() {

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        Integer actual = testing.sumArr(array);

        assertEquals(55, actual, "The expected result from the given array is 55");
    }

    @Test
    void sumArrIsNull() {

        Integer actual = testing.sumArr(null);

        assertNull(actual, "If the array is null, the result should be null");

    }
}