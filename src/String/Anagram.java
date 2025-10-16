package String;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str = "sanket";
        String str2 = "teksna";
        System.out.println(isAnagram(str, str2));

    }

    public static boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n) {
            return false;
        } else {
            //System.out.println("true");
        }
        int count[] = new int[26];//ASCII code use
        for (int i = 0; i < m; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {


            if (count[i] != 0) {
                return false;
            }

        }
        return true;
    }


}


