package MostAskedQuestions;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	public static void main(String[] args) {
		String str = "leetcode";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); //l
			int idx = str.indexOf(ch);//0
			int lastidx = str.lastIndexOf(ch);//0
			System.out.println(lastidx);
			if(idx==lastidx) {
				System.out.println(idx);
				break;
			}
		}
		
//		System.out.println(-1);
		
	}
}
