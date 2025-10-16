package Array;

import java.util.Arrays;

public class Movezero {
    public static void main(String[] args) {
        int mo[] = {1, 2, 3, 0, 3, 0, 1, 2, 3};
        move(mo);
        System.out.println(Arrays.toString(mo));
    }

    static int move(int[] nums) {
        int arr=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr++;
            }
            else if (arr > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - arr] = t;


            }
        }
        return arr;
    }
}

