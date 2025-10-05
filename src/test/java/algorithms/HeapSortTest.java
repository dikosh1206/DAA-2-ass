package algorithms;

import java.util.Random;

public class HeapSortTest {
    public static void main(String[] args) {
        HeapSort sorter = new HeapSort();

        // Test on multiple input sizes
        int[] sizes = {100, 1000, 10000};

        for (int n : sizes) {
            int[] arr = generateRandomArray(n);
            sorter.resetMetrics();

            long startTime = System.nanoTime();
            sorter.sort(arr);
            long endTime = System.nanoTime();

            double durationMs = (endTime - startTime) / 1_000_000.0;

            System.out.println("===== HeapSort Benchmark =====");
            System.out.println("Array size: " + n);
            System.out.println("Comparisons: " + sorter.getComparisons());
            System.out.println("Swaps: " + sorter.getSwaps());
            System.out.println("Array accesses: " + sorter.getArrayAccesses());
            System.out.println("Execution time: " + durationMs + " ms\n");
        }
    }


    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000); // random numbers
        }
        return arr;
    }
}
