package algorithms;

import metrics.PerformanceTracker;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        PerformanceTracker tracker = new PerformanceTracker();
        KadaneResult result = Kadane.maxSubarray(arr, tracker);

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Max Subarray Sum: " + result.maxSum);
        System.out.println("Start Index: " + result.start);
        System.out.println("End Index: " + result.end);
        System.out.println("\n--- Performance Metrics ---");
        System.out.println("Comparisons: " + tracker.getComparisons());
        System.out.println("Array Accesses: " + tracker.getArrayAccesses());
        System.out.println("Assignments: " + tracker.getAssignments());
        System.out.println("Time (ns): " + tracker.getNanos());
        System.out.println("Memory Delta (bytes): " + tracker.getMemDelta());
    }
}
