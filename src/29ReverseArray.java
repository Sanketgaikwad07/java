import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("welcome The Reverse Array\n");
        int[] numArr = ArrayUtilites.inputArray();
        reverse(numArr);
        System.out.print("your reversal array is ");
        ArrayUtilites.displayArray(numArr);
        //int num=sc.nextInt();

    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;

        }
    }
}
