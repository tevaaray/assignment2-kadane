package algorithms;

import metrics.PerformanceTracker;

public class Kadane {


    public static KadaneResult maxSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new KadaneResult(0, -1, -1);
        }

        long maxSum = arr[0];
        long currentSum = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum + arr[i] < arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new KadaneResult(maxSum, start, end);
    }

    public static KadaneResult maxSubarray(int[] arr, PerformanceTracker t) {
        long startTime = System.nanoTime();
        t.setMemBefore(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

        if (arr == null || arr.length == 0) {
            t.setNanos(System.nanoTime() - startTime);
            return new KadaneResult(0, -1, -1);
        }

        t.incArrayAccesses(2);
        long maxSum = arr[0];
        long currentSum = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            t.incArrayAccesses(1);
            t.incComparisons(1);

            if (currentSum + arr[i] < arr[i]) {
                currentSum = arr[i];
                tempStart = i;
                t.incAssignments(2);
            } else {
                currentSum += arr[i];
                t.incAssignments(1);
            }

            t.incComparisons(1);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
                t.incAssignments(3);
            }
        }

        t.setMemAfter(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        t.setNanos(System.nanoTime() - startTime);

        return new KadaneResult(maxSum, start, end);
    }
}
