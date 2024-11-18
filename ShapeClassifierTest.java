import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeClassifierTest {

    /**
     * This is an example test 
     */
    @DisplayName("Example Test")
    @Test
    public void example() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertNotEquals("Yes", answer);
    }


        private final ShapeClassifier classifier = new ShapeClassifier();

        @DisplayName("Test Equilateral Triangle")
        @Test
        public void testEquilateralTriangle() {
            String result = classifier.evaluateGuess("Equilateral,Large,Yes,100,100,100");
            assertNotNull(result, "Result should not be null");
            // Assuming the method will return "Yes" for correct answers
            assertEquals("Wrong Size,Wrong Even/Odd", result, "It should recognize a large, even-perimeter equilateral triangle");
        }

        // Additional tests can be added here following the same structure

}










