
    import java.util.*;

    class palidromeletter{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A = sc.next().toLowerCase();
            String B = sc.next().toLowerCase();
            sc.close();

            if (A.length() != B.length()) {
                System.out.println("Not Anagrams");
                return;
            }

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            // Count characters in A
            for (char ch : A.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }

            // Count characters in B
            for (char ch : B.toCharArray()) {
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            // Compare maps
            if (map1.equals(map2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }


