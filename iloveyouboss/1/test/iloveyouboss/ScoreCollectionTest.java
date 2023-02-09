package iloveyouboss;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import static org.junit.Assert.*;

public class ScoreCollectionTest {
    private ScoreCollection collection;

    @Before
    public void setUp() {
        this.collection = new ScoreCollection();
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() throws Exception {
        // Arrange
        this.collection.add(() -> 5);
        this.collection.add(() -> 7);

        // Act
        int arithmeticMean = this.collection.arithmeticMean();

        // Assert
        assertEquals(arithmeticMean, 6);
    }

    @Test
    public void answersMeanOfZeroNumbers() throws Exception {
        // Arrange beforehand
        // Act
        int arithmeticMean = this.collection.arithmeticMean();

        // Assert
        assertEquals(arithmeticMean, 0);
    }
}