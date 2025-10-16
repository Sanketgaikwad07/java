package Array;

import java.util.Arrays;

public class rotate {
 static void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;  // In case k > n

            reverse(nums, 0, n - 1);         // Step 1: Reverse whole array
            reverse(nums, 0, k - 1);         // Step 2: Reverse first k elements
            reverse(nums, k, n - 1);         // Step 3: Reverse remaining n-k elements
        }

        // Helper method to reverse array elements from index 'start' to 'end'
        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Test the rotation
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 2;
            rotate(nums, k);

            // Output result
            for (int num : nums) {
                System.out.print((num) + " ");
            }
        }
    }


