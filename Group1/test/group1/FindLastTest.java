package group1;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;


public class FindLastTest {
    private static ArrayList<TestPair> testCases;

    private static class TestPair {
        public int[] testArray;
        public int testValue;
        public int lastIndex;

        public TestPair(int[] testArray, int testValue, int lastIndex) {
            this.testArray = testArray;
            this.testValue = testValue;
            this.lastIndex = lastIndex;
        }
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        int[] arr1 = {2, 3, 5};
        int[] arr2 = {2, 2, 3, 9};
        int[] arr3 = {4, 3, 5, 4, 1};

        TestPair pair1 = new TestPair(arr1, 3, 1);
        TestPair pair2 = new TestPair(arr2, 2, 1);
        TestPair pair3 = new TestPair(arr3, 4, 3);
        testCases = new ArrayList<>();
        testCases.add(pair1);
        testCases.add(pair2);
        testCases.add(pair3);
    }


    @Test
    public void lastOccurrenceInFirstElement() {
        int[] arr = {2, 3, 5};
        int y = 3;
        assertEquals("Last occurrence in first element", 1,
                FindLast.findLast(arr, y));
    }

    @Test
    public void runTestCases() {
        for (TestPair testCase : testCases) {
            assertEquals(testCase.lastIndex,
                    FindLast.findLast(testCase.testArray, testCase.testValue));
        }
    }
}