package arrays;

public class RotateArrayJava {
public static void main(String[] args) {
	solution(new int [] {1,2,3,4,5,6,7},3);
}

private static void solution(int[] arr, int k) {
	// TODO Auto-generated method stub
	if(k>arr.length) {
		k=k%arr.length;
	}
	int res[] = new int[arr.length];
	for (int i = 0; i < k; i++) {
		res[i] = arr[arr.length-k-i];
	}
	
	int j=0;
	for (int i = k; i < arr.length; i++) {
		res[i] = arr[j];
		j++;
	}
	System.arraycopy(arr, j, res, k, j);
}
}
