public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Case-sensitive comparison
        System.out.println("Case-sensitive comparison: " + str1.equals(str2));

        // Case-insensitive comparison
        System.out.println("Case-insensitive comparison: " + str1.equalsIgnoreCase(str2));
    }
}
