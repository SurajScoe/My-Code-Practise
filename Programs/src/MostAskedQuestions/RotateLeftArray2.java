package MostAskedQuestions;

import java.util.Arrays;

public class RotateLeftArray2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		solution(arr,k);
		System.out.println(Arrays.toString(arr));
	}

	private static void solution(int[] arr, int k) {
		// TODO Auto-generated method stub
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		reverse(arr, arr.length-k, arr.length-1);
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stu
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
