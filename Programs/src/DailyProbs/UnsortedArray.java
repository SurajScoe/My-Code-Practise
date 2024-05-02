package DailyProbs;

public class UnsortedArray {
public static void main(String[] args) {
	int arr[] = new int[] {10,3,2,1,5,7,9,4,6};
	
	int n = 10;
	int totalSum = n*(n+1)/2;
	int arrSum = 0;
	for (int i = 0; i < arr.length; i++) {
		arrSum += arr[i];
	}
	
	System.out.println("The missing number is : "+ (totalSum-arrSum));
}
}
