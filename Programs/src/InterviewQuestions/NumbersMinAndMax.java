package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class NumbersMinAndMax {
public static void main(String[] args) {
	String numStr = Integer.toString(163);
	
	char[] dig = numStr.toCharArray();
	
	Arrays.sort(dig);
	
	int min = Integer.parseInt(new String(dig));
	
	Arrays.sort(dig);
	
	reverseArray(dig);
		
	int max = Integer.parseInt(new String(dig));
	
//	System.out.println(max+" "+min);
	
	System.out.println(max-min);
	
	
	System.out.println(max);
}

private static void reverseArray(char[] dig) {
	int start = 0;
	int end = dig.length-1;
	
	while(start<end) {
		char temp = dig[start];
		dig[start] = dig[end];
		dig[end] = temp;
		
		start++;
		end--;
	}
	
}
}
