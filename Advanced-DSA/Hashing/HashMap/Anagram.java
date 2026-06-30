import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        // Quick safeguard: if lengths aren't equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Fixed 1: Changed key type from String to Character
        HashMap<Character, Integer> hm = new HashMap<>(); 
        
        // Populate frequencies for string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        // Decrement frequencies for string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i); // Fixed 2: Extracted ch inside this loop's scope
            
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    // Fixed 3: Changed comma to a minus sign
                    hm.put(ch, hm.get(ch) - 1); 
                }
            } else {
                return false;
            }
        }
        
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println("Are anagrams: " + isAnagram(s, t)); // Output: true
    }
}