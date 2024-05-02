package MostAskedQuestions;

import java.util.Arrays;

public class RotateLeftArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		solution(arr,k);
	}

	private static void solution(int[] arr, int k) {
		
		int temp[] = new int[k];
		
		for(int i=0;i<k;i++) {
			temp[i] = arr[i];//1 2 3
		}
		
		for(int i=0;i<arr.length-k;i++) {
			arr[i] = arr[i+k];// 4 5 6 7
		}
		
		for(int i=arr.length-k;i<arr.length;i++) {
			arr[i] = temp[i-k-1];
		}
		
//		return Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
	}
}
