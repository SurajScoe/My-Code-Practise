package practise;

public class reverseAnumber {
	public static void main(String[] args) {
		int n = 123;
		String str = "";
		
		while(n>0) {
			int rem = n%10;
			str += rem;
			n/=10;
		}
		System.out.println(str);
		
	}
}
