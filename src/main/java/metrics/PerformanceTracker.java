package metrics;

public class PerformanceTracker {
    private int comparisons = 0;
    private int swaps = 0;
    private long startTime;
    private long endTime;

    public void startTracking() {
        comparisons = 0;
        swaps = 0;
        startTime = System.nanoTime();
    }

    public void stopTracking() {
        endTime = System.nanoTime();
    }

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    public long getExecutionTime() {
        return endTime - startTime;
    }
}
