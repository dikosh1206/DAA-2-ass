package cli;

import algorithms.HeapSort;
import metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===== Heap Sort Performance Benchmark =====");


        System.out.print("Enter array size: ");
        int size = scanner.nextInt();


        System.out.println("Choose array type:");
        System.out.println("1. Random");
        System.out.println("2. Sorted (ascending)");
        System.out.println("3. Reversed (descending)");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        int[] arr = new int[size];

        switch (choice) {
            case 1 -> {
                for (int i = 0; i < size; i++) arr[i] = random.nextInt(10000);
            }
            case 2 -> {
                for (int i = 0; i < size; i++) arr[i] = i;
            }
            case 3 -> {
            }
            default -> {
                System.out.println("Invalid choice! Using random array.");
                for (int i = 0; i < size; i++) arr[i] = random.nextInt(10000);
            }
        }

        System.out.println("\nArray before sorting:");
        System.out.println(Arrays.toString(Arrays.copyOf(arr, Math.min(20, arr.length))) + " ...");


        PerformanceTracker tracker = new PerformanceTracker();
        HeapSort heapSort = new HeapSort(tracker);

        tracker.startTracking();
        heapSort.sort(arr);
        tracker.stopTracking();

        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(Arrays.copyOf(arr, Math.min(20, arr.length))) + " ...");

        // Вывод метрик
        System.out.println("\n===== Results =====");
        System.out.println("Array size: " + size);
        System.out.println("Comparisons: " + tracker.getComparisons());
        System.out.println("Swaps: " + tracker.getSwaps());
        System.out.println("Execution time (ns): " + tracker.getExecutionTime());
        System.out.println("===============================");
    }
}
