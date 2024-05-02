package DailyProbs;

import java.util.HashMap;

public class FirstNonReapeationgChar {
	public static void main(String[] args) {
		String str = "hello";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
	}
}
