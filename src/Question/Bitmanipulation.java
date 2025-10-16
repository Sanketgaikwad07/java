package Question;


    import java.util.*;

    public class Bitmanipulation  {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            List<List<Integer>> allSubsets = new ArrayList<>();

            int n = arr.length;
            int total = 1<<n; // 2^n

            for (int mask = 0; mask < total; mask++) {
                List<Integer> subset = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    // check if jth bit in mask is set
                    if ((mask & (1<<j)) != 0) {
                        subset.add(arr[j]);
                    }
                }
                allSubsets.add(subset);
            }

            System.out.print("All subsets: " + allSubsets);
        }
    }


