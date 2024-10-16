public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0, consonantCount = 0;
        
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
