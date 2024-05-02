package practise;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(98,56));
	}

	private static int gcd(int i, int j) {
		if(i==0)
			return j;
		if(j==0)
			return i;
		if(i==j)
			return i;
		if(i>j)
			return gcd(i-j,j);
		else
			return gcd(i,j-i);
	}
}
