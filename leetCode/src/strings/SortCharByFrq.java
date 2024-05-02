package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortCharByFrq {
	public static void main(String[] args) {
		System.out.println(SortCharWithFrq("tree"));
		System.out.println(SortCharWithFrq("cccaaa"));
		System.out.println(SortCharWithFrq("Aabb"));


	}

	private static String SortCharWithFrq(String str) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		//t--1 r--1 e--2
		for(char c : ch) {
			int res = map.getOrDefault(c, 0)+1;
			map.put(c,res);
		}
		
		Map<Character, Integer> map2 = new TreeMap<Character, Integer>(map);
//		return map2.toString();
		
		
		// e--2 r--1 t--1
		
		String str1 = "";
		
		for(char c : map2.keySet()){// e
			for(int i=0;i<map2.get(c);i++) { //0 to 2
				str1 += c;
			}
		}
		
		return str1;
		
		
	}
}
