package MostAskedQuestions;

public class flowerBedproblem {
	public static void main(String[] args) {
		int arr[] = {1,0,0,0,1};
		System.out.println(findFlowers(arr,2));
	}

	private static boolean findFlowers(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return true;
		}
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]==0) && (i==0 || arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0)) {
				arr[i] = 1;
				n--;
				if(n==0)
					return true;
			}
		}
		return false;
	}
}
