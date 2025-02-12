import java.util.Scanner;

class maxMinElement {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("welcome the max element\n");
        int[] numArr = ArrayUtilites.inputArray();
        // int num = sc.nextInt();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max of the array  is:" + max);
        System.out.println("Min of the array  is:" + min);
        //System.out.println("enter the number: "+num);

    }

    public static int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MAX_VALUE;

        }
        int max = numArr[0];
        int i = 1;
        while (i < numArr.length) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }

        return max;
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length) {
            if (min > numArr[i])
                min = numArr[i];

            i++;
        }
        return min;
    }
}