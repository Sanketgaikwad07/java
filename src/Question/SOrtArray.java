package Question;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class SOrtArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 3, 4};
        Arrays.sort(arr);
        for (int i : arr) {//more flexible and readible
            System.out.print(i);
        }
    }
}
