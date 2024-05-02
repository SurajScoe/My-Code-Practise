package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairSumtarget {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,6};
		int target = 9;
		
		solution1(arr,target);
		System.out.println(Arrays.toString(removeDuplicate(arr)));
//		removeDuplicate1(arr);
	}

	private static void removeDuplicate1(int[] arr) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int num : arr) {
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		
		Integer newArr[] = list.toArray(new Integer[list.size()]);
		
		
		
	}

	private static int[] removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int newArr[] = new int[set.size()];
		int idx = 0;
		
		
		for(int num : set) {
			newArr[idx++]=num;
		}
		
//		System.out.println(Arrays.toString(newArr));
		
		return newArr;
		
	}

	private static void solution1(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		 
		 for(int num : arr) {
			 int comp1 = target - num;
			 if(map.containsKey(comp1)) {
				 System.out.println("("+num+" , "+comp1+")");
			 }
			 map.put(num,1);
		 }
		 
	}
}
