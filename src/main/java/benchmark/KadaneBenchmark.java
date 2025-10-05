package benchmark;

import algorithms.Kadane;
import algorithms.KadaneResult;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class KadaneBenchmark {

    private static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(2001) - 1000; // [-1000, 1000]
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int[] sizes = {100, 1000, 10000, 100000};

        FileWriter writer = new FileWriter("benchmark_results.csv");
        writer.write("Size,Time(ns),MaxSum,StartIndex,EndIndex\n");

        for (int size : sizes) {
            int[] arr = generateArray(size);

            long start = System.nanoTime();
            KadaneResult result = Kadane.maxSubarray(arr);
            long end = System.nanoTime();
            long time = end - start;

            writer.write(size + "," + time + "," + result.getMaxSum() + "," + result.getStartIndex() + "," + result.getEndIndex() + "\n");

            System.out.println("✅ Size: " + size + " → Time: " + time + " ns");
        }

        writer.close();
        System.out.println("\n📊 Results saved to benchmark_results.csv");
    }
}
