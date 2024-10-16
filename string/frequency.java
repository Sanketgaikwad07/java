import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello, World!";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Character Frequencies: " + frequencyMap);
    }
}
