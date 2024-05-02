package DailyProbs;

import java.util.Iterator;

public class LogestIncreasongSubsequence {
	public static void main(String[] args) {
		int arr[] = { 100,4,200,1,3,2};
        int n = arr.length;
 
        // Function call
        System.out.println("Length of lis is "
                           + lis(arr, n));
	}

	private static int lis(int[] arr, int n) {
//		// TODO Auto-generated method stub
//		return null;
		
		int arr1[] = new int[n];
		int i, j, max = 0;
		
		//fill the array first
		for (i = 0; i < arr1.length; i++) {
			arr1[i]=1;//arr1-->1,1,1...
		}
		
		//
		for(i=1;i<n;i++) {
			for(j=0;j<i;j++) {
				//22>10 && 1<2
				if(arr[i]>arr[j] && arr1[i]<arr1[j]+1) {
					arr1[i]=arr1[j]+1;//arr1[1]=2 //arr1[1]=3
				}
			}
		}
		
		//pick the max of all LIS values
		for(i=0;i<n;i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
		}
		
		return max;
	}
}
