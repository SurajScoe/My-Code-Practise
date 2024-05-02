package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem1 {
	public static void main(String[] args) {
		System.out.println(groupAnargums(new String[]{"eat","tea","tan","ate","nat","bat"}));
	}

	private static List<List<String>> groupAnargums(String[] arr) {
		
		Map<String,List<String>> map = new HashMap<>();
		// TODO Auto-generated method stub
		for(String str : arr) {
			char ch[] = str.toCharArray();
			
			
			Arrays.sort(ch);
			String s1 = String.valueOf(ch);
			System.out.println("Step 1 :\n"
					+ "given string on sorting "+" = "+s1);
			if(!map.containsKey(s1)) {
				map.put(s1,new ArrayList<>());
				System.out.println("Step 1.1 : "+map);
			}
			
			System.out.println("Step 2 :\n"
					+ "given map with map.get(s1) = value = "+ map.get(s1));
			map.get(s1).add(str); // adding the str to the value
			
			System.out.println("Step 3 : \n"
					+ "given map with map after adding str = "+map);
			
					System.out.println("Step 4 : \nthe values of map are "+map.values());
		}
		return new ArrayList<>(map.values());
	}
}
