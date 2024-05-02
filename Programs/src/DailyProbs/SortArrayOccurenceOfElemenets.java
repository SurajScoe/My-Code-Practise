package DailyProbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayOccurenceOfElemenets {
	public static void main(String[] args) {
		int arr[] = new int[] {4,4,4,5,1,3,3,2,2};
		findArray(arr);
	}

	private static void findArray(int[] arr) {
		int n = arr.length;
//HashMap<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> map = new TreeMap<>();
        
        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1);
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b)->{
            if(map.get(b) == map.get((a)))
            return a-b;
            else
            return map.get(b)-map.get(a);
        });
        
       ArrayList<Integer> l1 = new ArrayList<Integer>();
       
       for(int i : list) {
    	   while(map.get(i)!=0) {
    		   l1.add(i);
    		   map.put(i, map.getOrDefault(i, 0)-1);
    	   }
       }
       System.out.println(l1);
		
	}
}
