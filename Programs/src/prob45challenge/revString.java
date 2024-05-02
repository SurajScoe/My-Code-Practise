package prob45challenge;

public class revString {
	public static void main(String[] args) {
		String str = "Suraj".toLowerCase();
		StringBuilder str1 = new StringBuilder(str).reverse();
		System.out.println(str1);
	}
}
