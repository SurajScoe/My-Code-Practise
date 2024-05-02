package practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "abcbbczcxbya";
		
		System.out.println(solution1(str));
		System.out.println(solution2(str));
		System.out.println(solution3(str));
		System.out.println(solution4(str));

	}
	
	public static String solution1(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				s += str.charAt(i);
			}
		}
		
		return s;	
	}
	
	public static String solution2(String str) {
		HashSet<Character> set = new HashSet<>();
		
		StringBuilder s = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				s.append(ch);
			}
		}
		
		String s1 = new String(s);
		
		return s1;
	}
	
	public static String solution3(String str) {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(s.indexOf(String.valueOf(ch))==-1) {
				s.append(ch);
			}
		}
		
		return new String(s);
	}
	
	
	public static String solution4(String str) {
		StringBuilder s = new StringBuilder();
		
		int[] freq = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(freq[ch]==0) {
				freq[ch]++; // freq[97]++-->1 freq[98]++-->1
				s.append(ch);//then append it
			}
		}
		
		return new String(s);
	}
}
