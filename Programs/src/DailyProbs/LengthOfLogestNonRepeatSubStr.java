package DailyProbs;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLogestNonRepeatSubStr {
	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(longestSubstring(str));
	}

	private static int longestSubstring(String s) {
		
		
		 int n = s.length();
	        int maxLength = 0;
	        Set<Character> charSet = new HashSet<>();

	        for (int start = 0, end = 0; end < n; end++) {
	            while (charSet.contains(s.charAt(end))) {
	                charSet.remove(s.charAt(start));
	                start++;
	            }

	            charSet.add(s.charAt(end));
	            maxLength = Math.max(maxLength, end - start + 1);
	        }

	        return maxLength;
		
}
}