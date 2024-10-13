import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        char firstNonRepeating = '\0';
        for (char c : input.toCharArray()) {
            if (charCount.get(c) == 1) {
                firstNonRepeating = c;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating characters found.");
        }
    }
}
