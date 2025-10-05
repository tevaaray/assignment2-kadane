package algorithms;


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
}
