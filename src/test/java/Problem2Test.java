import org.junit.Test;

import static org.junit.Assert.*;
//Bubble sort: ascending order
public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        // add your tests here
        int[][] inputs = {
                {3},
                {1, 2, 3},
                {4, 9 , 0, 3, 6},
                {7, -1, 12, 8},
                {-10, -6, -18, -10}
        };
        int[][] answers = {
                {3},
                {1, 2, 3},
                {0, 3, 4, 6, 9},
                {-1, 7, 8, 12},
                {-6, -10, -10, -18}
        };

        assertEquals(inputs.length, answers.length);

        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(answers[i], inputs[i]);
        }
    }

    @Test
    public void secondTest() {
        int[] input = {4,9,0, 3,6};
        int[] answer = {0,3,4,6,9};

        Problem2.bubbleSort(input);

        assertArrayEquals(answer, input);
    }
}
