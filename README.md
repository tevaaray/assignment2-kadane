# Kadane's Algorithm – Assignment 2

## 1. Project Overview

This project implements **Kadane’s Algorithm** for finding the maximum subarray sum in a linear time complexity **O(n)**.  
It is part of the **Design and Analysis of Algorithms (DAA)** course Assignment 2, focused on algorithm implementation, theoretical analysis, empirical validation, and peer code review.

The project includes:
- Clean and optimized Java implementation
- Comprehensive unit tests
- CLI interface for benchmarking
- Performance metrics and CSV export
- Theoretical vs empirical complexity analysis

---


## 2. How to Build

Make sure you have **Java 17+** and **Maven** installed.

To build the project:

```bash
mvn clean package
```
## 3. Run the CLI Benchmark

You can run the CLI benchmark directly using:
```bash
java -cp target/classes cli.BenchmarkRunner
```

Example Output:

Enter the size of the array: 50

Generated an array of size: 50

=== RESULTS ===

Maximum Subarray Sum: 11831

Start Index: 4

End Index: 46

Execution Time: 5434100 ns

## 4. Complexity Analysis

Time Complexity: O(n) – the algorithm performs a single pass over the array.

Space Complexity: O(1) – the algorithm uses a constant amount of extra space.

Best Case: Ω(n)

Average Case: Θ(n)

Worst Case: O(n)

## 5. Testing

Run all unit tests with:

```bash
mvn test
```
The test suite covers:

Empty arrays

All-negative arrays

Mixed positive and negative arrays

Single-element arrays

Randomized property-based tests

## 6. Optimization

The algorithm is already optimal with O(n) time complexity, but several micro-optimizations were implemented:

Early reset of the current sum to reduce unnecessary comparisons.

Efficient index tracking for subarray reconstruction.

In-place processing to minimize memory usage.

## 7. Performance Benchmarking

The BenchmarkRunner runs the algorithm on various input sizes and records:

Execution time (nanoseconds)

Number of comparisons

Number of array accesses

This data is used to verify the theoretical complexity empirically and generate plots (time vs input size).

## 8. Empirical Results 

| Input Size (n) | Max Subarray Sum | Execution Time (ns) |
|---------------|------------------|----------------------|
| 100           | 832              | 12,500              |
| 1,000         | 9,422            | 54,310              |
| 10,000       | 18,390           | 417,800             |
| 100,000      | 118,310          | 5,434,100           |
## 9. Technologies Used

Java 17

Apache Maven

JUnit 5

Custom Metrics Tracker

CSV Export for Performance Logging

## 10. Author

Tyulebayeva Arailym

Design and Analysis of Algorithms – Assignment 2