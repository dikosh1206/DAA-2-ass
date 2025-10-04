package algorithms;

import metrics.PerformanceTracker;

public class HeapSort {

    private final PerformanceTracker tracker;

    public HeapSort(PerformanceTracker tracker) {
        this.tracker = tracker;
    }

    public void sort(int[] arr) {
        int n = arr.length;

        // Построение max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            tracker.incrementSwaps();
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // Проверяем левый потомок
        if (l < n) {
            tracker.incrementComparisons();
            if (arr[l] > arr[largest]) {
                largest = l;
            }
        }

        // Проверяем правый потомок
        if (r < n) {
            tracker.incrementComparisons();
            if (arr[r] > arr[largest]) {
                largest = r;
            }
        }

        // Если нужно — меняем местами и продолжаем
        if (largest != i) {
            tracker.incrementSwaps();
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
