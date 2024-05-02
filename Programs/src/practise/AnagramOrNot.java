package practise;

import java.util.Arrays;

public class AnagramOrNot {
	public static void main(String[] args) {
		String s1 = "racei";
		String s2 = "caire";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean flag = false;
		
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]!=ch2[i])
				flag=true;
		}
		
		if(!flag)
		System.out.println("String : "+s1+" and "+s2+ " are Anagrams ");
		else
		System.out.println("String : "+s1+" and "+s2+ " are not Anagrams ");


	}
}
