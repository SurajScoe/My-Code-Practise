package arrays;

import java.util.Arrays;

public class rotateArray {
public static void main(String[] args) {
	System.out.println(rotategivenArray(3,new int[] {1,2,3,4,5,6,7}));
}

private static String rotategivenArray(int k, int[] arr) {
	// TODO Auto-generated method stub
	
	int nums[] = new int[arr.length];
	int index=0;
	int lastElement = arr.length-k-1;
//	6 to 4
	for(int i=arr.length-1;i>=lastElement;i--) {
		nums[index++]=arr[i];
	}
	for (int i = k+1; i < nums.length; i++) {
		nums[index++]=arr[i];
	}
	
	return Arrays.toString(nums);
}
}
