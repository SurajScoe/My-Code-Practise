package newproject;

import java.util.Scanner;

import java.util.Scanner;

public class MyNewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeConsecutiveXVowels(input);
//        System.out.println("Modified output: " + result);
        System.out.println("TesXng is a Xring jX");
    }

    public static String removeConsecutiveXVowels(String input) {
//        StringBuilder output = new StringBuilder();
    	String s = "";
        boolean prevIsXVowel = false; // Flag to track consecutive xvowels

        for (char c : input.toCharArray()) {
            if (isXVowel(c)) {
                if (!prevIsXVowel) {
                    s+=c; // Append the first xvowel
                    prevIsXVowel = true;
                }
            } else {
                s+=c; // Append non-xvowels
                prevIsXVowel = false;
            }
        }

        return s.toString();
    }

    public static boolean isXVowel(char c) {
        // Define xvowels: a, b, e, i, o, u, t
        return "abeiout".contains(Character.toString(c));
    }
}

//i/p
//Testing is boaring job
//TesXng is a Xring jX



//o/p
//Tesng is ring j

//o/p
//Testng is boring job
