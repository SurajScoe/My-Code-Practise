package practise;

import java.util.HashMap;
import java.util.Map;

public class ArrangeEachCharWithItsFreq {
	public static void main(String[] args) {
		String str = "ccbaa";
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		String s = "";
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			s += entry.getKey() +""+ entry.getValue();
		}
		
		return s;
	}
}
