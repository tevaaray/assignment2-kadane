package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadaneTest {

    @Test
    void testBasicCase() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneResult result = Kadane.maxSubarray(arr);

        assertEquals(6, result.getMaxSum());
        assertEquals(3, result.getStartIndex());
        assertEquals(6, result.getEndIndex());
    }
}
