package Sorting_Algo;
import static Sorting_Algo.MergeSort.*;

import java.util.Arrays;
public class SortingAlgo_Main {
public static void main(String[] args) {
    int [] arr = {9,14,3,2,43,11,58,22};
    
//    System.out.println("initial array : "+Arrays.toString(arr));
//    
//    bubbleSort(arr);
//    System.out.println("Bubble Sort  : "+Arrays.toString(arr));
    
//    BubbleSort2(arr);
//    System.out.println("Bubble Sort2  : "+Arrays.toString(arr));
    
//    System.out.println();
//    
//    selectionSort(arr);
//    System.out.println("Selection Sort : "+Arrays.toString(arr));
    
//    SelectionSort2(arr);
//  System.out.println("Selection Sort2 : "+Arrays.toString(arr));

//    
//    System.out.println();
//    
//    selectionSort(arr);
//    System.out.println("Insertion sort : "+ Arrays.toString(arr));
//    
    
    insertionSort(arr);
  System.out.println("Selection Sort : "+Arrays.toString(arr));

    
//    
//    quickSort(arr, 0, arr.length-1);
//    System.out.println("Quick-Sort : "+ Arrays.toString(arr));
    
//    QuickSort2(arr, 0, arr.length-1);
//  System.out.println("Quick-Sort2 : "+ Arrays.toString(arr));

}
}
