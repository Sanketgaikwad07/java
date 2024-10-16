public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        boolean isPalindrome = cleanStr.equals(reversed);
        
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}
