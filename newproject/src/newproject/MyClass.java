package newproject;

import java.util.Scanner;
public class MyClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int[] arr = new int[100]; 
        int index = 0;

        while ((num = scanner.nextInt()) >= 0) {
            arr[index++] = num;
        }

        processArray(arr, index);

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void processArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            if (num%10==2 && num > 42) {
                arr[i] = -6;
            } else if (num%10==2) {
                arr[i] = -5;
            } else if (num > 42) {
                arr[i] = -2;
            }
        }
    }
}
 //2
//6
//59
//82
//-1

/*-5
6
-2
-6*/