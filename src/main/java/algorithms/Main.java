package algorithms;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new Random().ints(size, -1000, 1000).toArray();

        KadaneResult result = Kadane.maxSubarray(arr);

        System.out.println("=== RESULTS ===");
        System.out.println("Maximum Subarray Sum: " + result.getMaxSum());
        System.out.println("Start Index: " + result.getStartIndex());
        System.out.println("End Index: " + result.getEndIndex());
    }
}