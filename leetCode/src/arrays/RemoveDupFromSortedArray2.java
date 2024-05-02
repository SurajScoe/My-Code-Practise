package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDupFromSortedArray2 {
	public static void main(String[] args) {
		int arr[] = new int[] {1,1,1,2,2,3};
		int len = arr.length-1;
		System.out.println(removeDuplicates(arr));
	}

	private static int removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap<>();
		 
		for(int n : arr) {
			int count = map.getOrDefault(n, 0)+1;
			map.put(n, count);
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(map.get(arr[i-1])>=2) {
				arr[i-1]=arr[i-1];//0-->1 , 2-->2
				arr[i]=arr[i];//1-->1 , 3-->2
			}
			else {
				arr[i]=arr[i];//4-->3
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		return arr.length-1;
	}
}
