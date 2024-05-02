package DailyProbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileCountAppearence {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("suraj.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the substring to look for : ");
		
		String word = sc.next();
		String line = bf.readLine();
		
		int count = 0;
		
		do {
			count += (line.length() - line.replace(word,"").length())/word.length();
			line = bf.readLine();
		}while(line!=null);
		
		System.out.println("There are "+count+" occurrence of "+word+" in ");
	}
}
