package group1;

import org.junit.Test;

import static org.junit.Assert.*;

public class lastZeroTest {
    @Test
    public void multipleZeroes() {
        int[] arr = {0, 1, 0};
        assertEquals("Multiple Zeroes: should find last one",
                2, lastZero.lastZero(arr));
    }
}