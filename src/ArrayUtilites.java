import java.util.Scanner;

class ArrayUtilites {
    public static int[] inputArray() {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the your number rows:  ");
        int num = sc.nextInt();
        System.out.println("please enter the colu");
        int[] size = new int[num];
        int i = 0;
        while (i < num) {
            System.out.print("please enter the element" + (i + 1) + ": ");

            size[i] = sc.nextInt();
            i++;
        }
        return size;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
