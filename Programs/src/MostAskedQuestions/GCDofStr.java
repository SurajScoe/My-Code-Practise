package MostAskedQuestions;
/*For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC" 

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB" 

Example 3:

Input: str1 = "LEET", str2 = "CODE" Output: ""

Constraints:

1 <= str1.length, str2.length <= 1000

str1 and str2 consist of English uppercase letters.*/
public class GCDofStr {
	public static void main(String[] args) {
		String str1 = "ABCABC";//ABCABC
		String str2 = "ABC";//ABC
		
		System.out.println(FindSolution(str1,str2));
	}

	private static String FindSolution(String str1, String str2) {
		
		char ch[] = str2.toCharArray();
		char character = ch[0];
		String str = "";
		str += ch[0];
		
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==character) {
				break;
			}
			
			if(ch[i]!=character) {
				str += ch[i];
			}
		}
		
		return str;
	}
}
