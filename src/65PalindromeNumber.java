import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the palindrome\n");
        System.out.print("Enter the number:");
        String str = sc.next();
        System.out.println("your string is" + (isPalindrome(str) ? "palindrome" : "Not palindrome"));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;

        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
