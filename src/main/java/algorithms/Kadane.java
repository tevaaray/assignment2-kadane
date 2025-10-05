package algorithms;

import metrics.PerformanceTracker;

public class Kadane {


    public static KadaneResult maxSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new KadaneResult(0, -1, -1);
        }

        long maxSum = arr[0];
        long currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;


        boolean allNegative = true;
        int maxElement = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                allNegative = false;
                break;
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        if (allNegative) {
            return new KadaneResult(maxElement, maxIndex, maxIndex);
        }

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            if (currentSum == arr[i]) tempStart = i;

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

        boolean allNegative = true;
        int maxElement = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                allNegative = false;
                break;
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        if (allNegative) {
            t.setNanos(System.nanoTime() - startTime);
            return new KadaneResult(maxElement, maxIndex, maxIndex);
        }

        long maxSum = arr[0];
        long currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            if (currentSum == arr[i]) tempStart = i;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        t.setMemAfter(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        t.setNanos(System.nanoTime() - startTime);

        return new KadaneResult(maxSum, start, end);
    }
}
