package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadaneTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        KadaneResult result = Kadane.maxSubarray(arr);
        assertEquals(0, result.maxSum);
        assertEquals(-1, result.start);
        assertEquals(-1, result.end);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        KadaneResult result = Kadane.maxSubarray(arr);
        assertEquals(42, result.maxSum);
        assertEquals(0, result.start);
        assertEquals(0, result.end);
    }

    @Test
    void testAllNegative() {
        int[] arr = {-5, -2, -7, -3};
        KadaneResult result = Kadane.maxSubarray(arr);
        assertEquals(-2, result.maxSum);
        assertEquals(1, result.start);
        assertEquals(1, result.end);
    }

    @Test
    void testMixedArray() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneResult result = Kadane.maxSubarray(arr);
        assertEquals(6, result.maxSum); // [4, -1, 2, 1]
        assertEquals(3, result.start);
        assertEquals(6, result.end);
    }

    @Test
    void testAllPositive() {
        int[] arr = {1, 2, 3, 4, 5};
        KadaneResult result = Kadane.maxSubarray(arr);
        assertEquals(15, result.maxSum);
        assertEquals(0, result.start);
        assertEquals(4, result.end);
    }
}
