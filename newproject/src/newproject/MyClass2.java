package newproject;

//Testing is boaring job
//TesXng is a Xring jX

import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class MyClass2 {
   public static boolean vowel(char s)
	{
		return (s=='a'||s=='b'||s=='e'||s=='i'||s=='o'||s=='t')?true:false;
	}
    public static String process(String str) {
        char arr[]=str.toCharArray();
        
        String s="";
    for(int i=0;i<arr.length-1;i++)
    {
    	if(vowel(arr[i])&&vowel(arr[i+1]))
    	{
    		
    		arr[i]=(char)(arr[i]-32);
	
    	}
    }
    
    for(int i=0;i<arr.length-1;i++)
    {
    	s+=arr[i];
    }
        return s;
    }

    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            String line = in.nextLine().trim();
            String retVal = process(line);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println(retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
