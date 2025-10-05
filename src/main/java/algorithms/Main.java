package algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        KadaneResult result = Kadane.maxSubarray(arr);

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Max Subarray Sum: " + result.maxSum);
        System.out.println("Start Index: " + result.start);
        System.out.println("End Index: " + result.end);
    }
}
