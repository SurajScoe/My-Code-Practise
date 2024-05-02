package DailyProbs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseAndSortStr {
	public static void main(String[] args) {
		 String str = "Hello World, I am learning Java";

	        // Convert the string to a list of words
	        List<String> words = Arrays.asList(str.split(" "));

	        // Sort the list of words in alphabetical order
//	        Collections.sort(words);

	        // Remove duplicate words from the list
	        Set<String> uniqueWords = new HashSet<>(words);
	        
	        String s = "";

	        // Print the sorted and unique words
	        for (String word : uniqueWords) {
	            s += word;
	        }
		 
		 
	
	}
}
