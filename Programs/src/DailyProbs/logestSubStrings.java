package DailyProbs;

import java.util.HashMap;

public class logestSubStrings {
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        int maxLength = 0;
        int start = 0, end = 0;
        int i = 0, j = 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        while (j < n) {
            if (!charIndexMap.containsKey(s.charAt(j)) || charIndexMap.get(s.charAt(j)) < i) {
                charIndexMap.put(s.charAt(j), j);
                if (j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                    end = j;
                }
                j++;
            } else {
                i = charIndexMap.get(s.charAt(j)) + 1;
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = findLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
