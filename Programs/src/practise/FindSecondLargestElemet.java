package practise;

public class FindSecondLargestElemet {
	public static void main(String[] args) {
		int arr[] = new int[]{1,1,4,0,11,9,2,3,4,5};
		
		int largest = arr[0];
		int secondlargest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		System.out.println(secondlargest);
	}
}
