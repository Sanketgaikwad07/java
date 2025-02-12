import java.util.Scanner;

class arrayseraching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 4, 5, 2, 1, 23, 45, 6, 76, 34, 21, 12, 34};
        System.out.println("welcome\n");
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        boolean isfound = isfound(arr, num);
        if (isfound) {
            System.out.println("your number found is array");
        } else {
            System.out.println("your array are not found");
        }


    }

    public static boolean isfound(int[] arr, int num) {

        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }


        return false;


    }


}
