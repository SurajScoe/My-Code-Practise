package DailyProbs;

import java.util.HashMap;
import java.util.Map;

public class NoOfCharOccurrencesInStr {
	public static void main(String[] args) {
		String s = "my name is suraj sainath malge";
		
		String str = s.replaceAll("\\s", "");
		
		
		
		System.out.println(solution(str));
		
		
	}

	private static String solution(String s) {
		// TODO Auto-generated method stub
String str = s.replaceAll("\\s", "");
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		String s2 = "";
		for(Character ch : map.keySet()) {
			Integer i = map.get(ch);
//			System.out.print(ch+""+i);
			s2 += ch+""+i;
		}
		return s2;
	}
	
	
}
