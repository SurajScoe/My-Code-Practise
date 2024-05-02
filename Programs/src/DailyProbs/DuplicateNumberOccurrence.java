package DailyProbs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberOccurrence {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,4,5,6,7,2,4};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a : arr) { //1
			map.put(a,map.getOrDefault(map,0)+1);//[1-0,2-0,4-0]
		}
		
		
		
		
	}
}
