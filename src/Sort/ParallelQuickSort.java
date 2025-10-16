package Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class ParallelQuickSort {

    private static class SortTask extends RecursiveAction {
        private final long[] array;
        private final int low;
        private final int high;


        private static final int THRESHOLD = 4096;

        public SortTask(long[] array, int low, int high) {
            this.array = array;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            // If the segment is small enough, sort it sequentially.
            if (high - low < THRESHOLD) {
                Arrays.sort(array, low, high + 1); // Using Arrays.sort for optimized sequential sort
            } else {
                // Partition the array and get the pivot's final index.
                int pivotIndex = partition(array, low, high);

                // Create two sub-tasks for the left and right partitions.
                SortTask leftTask = new SortTask(array, low, pivotIndex - 1);
                SortTask rightTask = new SortTask(array, pivotIndex + 1, high);

                // Execute both sub-tasks in parallel.
                invokeAll(leftTask, rightTask);
            }
        }
    }


    private static int partition(long[] array, int low, int high) {
        long pivot = array[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element (array[high]) with the element at i+1
        long temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partitioning index
    }

    /**
     * The main method to demonstrate the parallel sort.
     */
    public static void main(String[] args) {
        // --- Setup ---
        int size = 20_000_000; // 20 million elements
        long[] arrayToSort = new long[size];
        Random random = new Random();

        // Fill the array with random long values
        for (int i = 0; i < size; i++) {
            arrayToSort[i] = random.nextLong();
        }

        // Create a copy for a standard sequential sort to compare against
        long[] arraySequential = Arrays.copyOf(arrayToSort, arrayToSort.length);

        // --- Parallel Sort Execution ---
        // Get the common ForkJoinPool, which is sized to the number of available processors
        ForkJoinPool pool = ForkJoinPool.commonPool();
        SortTask mainTask = new SortTask(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("Starting parallel Quicksort...");
        long startTime = System.currentTimeMillis();

        // Start the main task and wait for it to complete
        pool.invoke(mainTask);

        long endTime = System.currentTimeMillis();
        long parallelTime = endTime - startTime;
        System.out.println("Parallel sort took: " + parallelTime + " ms");
        System.out.println("Number of processors used: " + pool.getParallelism());

        // --- Sequential Sort for Comparison ---
        System.out.println("\nStarting standard sequential sort for comparison...");
        startTime = System.currentTimeMillis();

        Arrays.sort(arraySequential, 0, arraySequential.length);

        endTime = System.currentTimeMillis();
        long sequentialTime = endTime - startTime;
        System.out.println("Sequential sort took: " + sequentialTime + " ms");

        // --- Verification ---
        // Verify that the parallel sort produced the correct result
        boolean isSortedCorrectly = Arrays.equals(arrayToSort, arraySequential);
        System.out.println("\nIs the array sorted correctly by the parallel algorithm? " + isSortedCorrectly);
    }
}