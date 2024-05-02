package practise;

import java.util.Arrays;
import java.util.Collections;

public class RevArrays {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		
		System.out.println("reverse an Array Solution 1 : "+ Arrays.toString(solution1(arr)));
		
		System.out.println("reverse an Array Solution 1 : "+ Arrays.toString(solution2(arr)));

	}
	
	public static int[] solution1(int arr[]) {
		
		int revArray[] = new int[arr.length];
		
		for(int i=0; i<arr.length ; i++) {
			revArray[i] = arr[arr.length-1-i];
		}
		
		return revArray;
	}
	
	
	public static int[] solution2(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		return arr;
	}
}
