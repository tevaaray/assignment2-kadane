package cli;

import algorithms.Kadane;
import algorithms.KadaneResult;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new Random().ints(size, -1000, 1000).toArray();
        System.out.println("Generated an array of size: " + size);

        long start = System.nanoTime();
        KadaneResult result = Kadane.maxSubarray(arr);
        long end = System.nanoTime();

        System.out.println("\n=== RESULTS ===");
        System.out.println("Maximum Subarray Sum: " + result.getMaxSum());
        System.out.println("Start Index: " + result.getStartIndex());
        System.out.println("End Index: " + result.getEndIndex());
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
