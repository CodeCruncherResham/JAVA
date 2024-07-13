//find all substrings of a string that are permutation of a given string
import java.util.*;
class Sliding2
{

    public static List<String> findPermutationSubstrings(String s, String target) {
        List<String> result = new ArrayList<>();

        // Generate all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);

                // Check if the substring is a permutation of the target string
                if (isPermutation(substring, target)) {
                    result.add(substring);
                }
            }
        }

        return result;
    }

    // Function to check if two strings are permutations of each other
    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s = "cbaabcab";
        String target = "abc";
        List<String> permutationSubstrings = findPermutationSubstrings(s, target);
        System.out.println("Substrings of '" + s + "' that are permutations of '" + target + "':");
        System.out.println(permutationSubstrings);
    }
}
