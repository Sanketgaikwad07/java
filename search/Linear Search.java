public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Found at index i
            }
        }
        return -1;  // Not found
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;
        int result = linearSearch(nums, target);
        System.out.println("Element found at index: " + result);
    }
}
