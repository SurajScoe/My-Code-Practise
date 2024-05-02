package Sorting_Algo;

import java.util.Iterator;

public class MergeSort {
//	public static void ms(int arr[],int left,int right) {
//		if(left >= right) {
//			return;
//		}
//		
//		int mid = (left+rigth)/2;
//		ms(arr,left,mid);
//		ms(arr,mid+1,right);
//		merge(arr,left,mid,mid+1,right);
//	}
//
//	private static void merge(int[] arr, int leftStart, int leftEnd, int rightStart, int rightEnd) {
//		// TODO Auto-generated method stub
//		int numElements = rigthEnd - leftStart + 1;
//		int [] newArr = new int[numElements];
//		int tempPosistion = -1;
//	}
//	
	
	
	
	
	//Bubble Sort
	
	public static int bubbleSort(int [] arr) {
		
		int len = arr.length-1;
		int count = 0;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
			if(count==0) {
			break;
		}
		}
		
		return arr.length-1;
		
		
	}
	
	
	//Bubble_Sort
//	public static void BubbleSort2(int arr[]) {
//		
//		int len = arr.length-1;
//		int count=0;
//		for (int i = 0; i < len; i++) {
//			for (int j = 0; j < len-i; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					count++;
//				}
//			}
//			if(count==0) {
//				break;
//			}
//		}
//		
//		
//	}
	
	
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = min+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	
	//Selection_Sort
	public static void SelectionSort2(int arr[]) {
		int min=0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			min = i;
			for (int j = min+1; j < len; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	public static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	
	//InsertionSort2
//	public static void InsertionSort2(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if(arr[i]<arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}
	
	
//	public static void quickSort(int [] arr, int left , int rigth) {
//		if(left>=rigth) {
//			return;
//		}
//		
//		int pivotLoc = partition(arr,left,rigth);
//		
//		quickSort(arr,left,pivotLoc-1);
//		quickSort(arr, pivotLoc+1, rigth);
//	}


//	private static int partition(int[] arr, int left, int rigth) {
//		int pivot = arr[left];
//		
//		while(left < rigth) {
//			while(arr[rigth]>pivot && left<rigth) {
//				rigth--;
//			}
//			
//			if(left < rigth) {
//				arr[left] = arr[rigth];
//				left++;
//			}
//			
//			while(arr[left]<pivot && left<rigth) {
//				left++;
//			}
//			
//			
//			if(left<rigth) {
//				arr[rigth]= arr[left];
//				rigth--;
//			}
//			
//			
//		}
//		
//		arr[left] = pivot;
//			return rigth;
//			
//	}
	
	
	public static void QuickSort2(int arr[], int left, int right) {
		if(left>=right) {
			return ;
		}
		
		int pivotLoc = partition(arr,left,right);
		
		QuickSort2(arr, left, pivotLoc-1);
		QuickSort2(arr, pivotLoc+1, right);

	}
	
	
	public static int partition(int arr[],int left, int rigth) {
		
		int pivot = arr[left];
		
		while(left<rigth) {
		while(arr[rigth]>pivot && left<rigth) {
			rigth--;
		}
		
		if(left<rigth) {
			arr[left] = arr[rigth];
			left++;
		}
		
		
		while(arr[left]<pivot && left<rigth) {
			left++;
		}
		
		if(left<rigth) {
			arr[rigth] = arr[left];
			rigth--;
		}
		}
		
		arr[left] = pivot;
		return rigth;
		
	}
}



