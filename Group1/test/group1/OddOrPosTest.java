package group1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrPosTest {
    @Test
    public void negativeOddNumbers() {
        int[] arr = {1, 2, -3};
        assertEquals("Negative odd numbers in array",
                3, OddOrPos.oddOrPos(arr));
    }
}