//find the  longest substring of a given string containing k distinct character
import java.util.*;

public class Sliding1 {
    public static String longestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return "";
        }

        int start = 0;
        int maxLength = 0;
        int maxStart = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            while (charCount.size() > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                if (charCount.get(startChar) == 0) {
                    charCount.remove(startChar);
                }
                start++;
            }

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcba";
        int k = 2;
        String longestSubstring = longestSubstringKDistinct(s, k);
        System.out.println("Longest substring with " + k + " distinct characters: " + longestSubstring);
    }
}
