public class StringExample {
    public static void main(String[] args) {
        // Create a string
        String original = "Hello, World! Welcome to Java programming.";

        // Print the original string
        System.out.println("Original String: " + original);

        // Print the length of the string
        System.out.println("Length: " + original.length());

        // Convert to uppercase
        String upperCase = original.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert to lowercase
        String lowerCase = original.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Check if the string contains a substring
        String substring = "Java";
        boolean contains = original.contains(substring);
        System.out.println("Contains '" + substring + "': " + contains);

        // Split the string into words
        String[] words = original.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
