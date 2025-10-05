package cli;

import algorithms.Kadane;
import algorithms.KadaneResult;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = generateRandomArray(n);
        System.out.println("Generated an array of size: " + n);

        long startTime = System.nanoTime();
        KadaneResult result = Kadane.maxSubarray(arr);
        long endTime = System.nanoTime();

        System.out.println("\n=== RESULTS ===");
        System.out.println("Maximum Subarray Sum: " + result.maxSum);
        System.out.println("Start Index: " + result.start);
        System.out.println("End Index: " + result.end);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(2000) - 1000; // numbers between -1000 and 1000
        }
        return arr;
    }
}
