import java.util.Scanner;

class SumPositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = ArrayUtilites.inputArray();
        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;

        }
        System.out.println("the sum is prime number is: " + sum + " ");
    }


}
