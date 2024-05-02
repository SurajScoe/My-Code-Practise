package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class prac {
public static void main(String[] args) {
	 int arr[] = {100,4,200,1,3,2};
     int n = arr.length;

//     System.out.println(
//         "Length of the Longest "
//         + "contiguous subsequence is "
//         + findLongestConseqSubseq(arr, n));
     
     findLongestConseqSubseq(arr, n);
}

private static void findLongestConseqSubseq(int[] arr, int n) {
	Arrays.sort(arr);
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(1);
	
	//adding the distinct numbers in list
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]!=arr[i-1]) {
			list.add(arr[i]);
		}
	}
	
	
	
	int count = 0;
	int ans = 0;
	//1, 9, 3, 10, 4, 20, 2
	//1,2,3,4,9,10,20
//	for (int i = 1; i < arr.length; i++) {
//		//check if curr element is equal to previous element
//		if(list.get(i)==list.get(i-1)+1) {
//			count++;
//		}else {
//			count = 1;
//		}
//		
//		ans = Math.max(ans, count);
//	}
	
	for (int i = 1; i < list.size(); i++) {
		int diff = Math.abs(list.get(i)-list.get(i-1));
		
		if(diff == 1 && i>0) {
			count++;
		}else {
			count = 1;
		}
		ans = Math.max(ans, count);
	}
	
	System.out.println(ans+1);
	
	
			
}
}
