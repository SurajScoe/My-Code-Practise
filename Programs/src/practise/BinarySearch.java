package practise;

public class BinarySearch {
public static void main(String[] args) {
	System.out.println(findKey(new int[] {1,2,3,4,5,6,7,8},6));
	System.out.println(findKeyByRecursion(new int[] {1,2,3,4,5,6,7,8},6));

}

private static int findKeyByRecursion(int[] arr, int key) {
	
	
	
	return 1;
}

private static int findKey(int[] arr, int key) {
	int start = arr[0];
	int end = arr[arr.length-1];
	
	while(start<=end) {
		int mid = start + (end-start)/2;
		if(key==arr[mid]) {
			return mid;
		}
		
		if(key>arr[mid]) {
			start=mid+1;
		}else {
			end=mid-1;
		}	
	}
	
	return -1;
}
}
