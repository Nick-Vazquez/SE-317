package group1;

import org.junit.*;
import static org.junit.Assert.*;

public class CountPositiveTest {

    @Test
    public void arrayContainsZeroes() {
        int[] arr = {-4, 2, -1, 2};
        assertEquals("Array contains zeroes", 2,
                CountPositive.countPositive(arr));
    }

    @Test
    public void arrayActuallyContainsZeroes() {
        int[] arr = {4, 2, -1, -4, 0, 1, 2};
        assertEquals("Array actually contains zeroes. Incorrect count.", 4,
                CountPositive.countPositive(arr));
    }
}