import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the palindrome\n");
        int[] numArr = ArrayUtilites.inputArray();
        boolean isPali = isPalindrome(numArr);
        if (isPali) {
            System.out.println("your array are palindrome");

        } else {
            System.out.println("your array are not palindrome");


        }

    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length) {

            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}