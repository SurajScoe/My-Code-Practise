package DailyProbs;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndValidString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[26];
	int count = 0;
	
	String str = sc.next();
	int l = str.length();
	
	for (int i = 0; i < l; i++) {
		int x = str.charAt(i)-'a';
		arr[x]++;
	}
	
	l = 0;
	
	Arrays.sort(arr);
	
	//count the number of "0"
	for (int i = 0; i < 26; i++) {
		if(arr[i] == 0) {
			l++;
		}
	}
	
	//count the number of "1"
	if(arr[l] == 1) {
		l++;//2
		count++;//1
	}
	
	for (int i = l+1; i < arr.length; i++) {
		if(arr[i] != arr[l]) {
			count++;
		}
	}
	
	if(count > 1) {
		System.out.println("NO");
	} else {
		System.out.println("YES");
	}
}
}
