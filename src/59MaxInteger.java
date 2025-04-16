import java.util.Scanner;

class MaxInteger {
    public static void main(String[] args) {
        System.out.println("Welcome to the array\n");
        int[] arr = ArrayUtilites.inputArray();
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("maximum number is: " + max);
    }
}
