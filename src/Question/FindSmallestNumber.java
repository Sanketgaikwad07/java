package Question;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {45, 65, 32, 64, 8, 21};
        int i = arr[0];

        for (int j : arr) {


            if (i > j) {

                i = j;
            }

        }
        System.out.println("The smallest element is=" + i);
    }
}

