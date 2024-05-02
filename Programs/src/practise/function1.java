package practise;

public class function1 {
	public static void main(String[] args) {
		String str = "suraj sainath malge";
		solution1(str);
	}
	
	public static void solution1(String str) {
		String s = "";
		
		String[] s1 = str.split(" ");
		
		for (int i = s1.length-1; i>=0; i--) {
			s += s1[i]+" ";
		}
		System.out.println(s);
	}
	
	public static void solution2(String str) {
		
	}
}
