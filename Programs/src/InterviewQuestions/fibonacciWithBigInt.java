package InterviewQuestions;

import java.math.BigInteger;

public class fibonacciWithBigInt {
	public static void main(String[] args) {
		System.out.println(fib(50));
	}

	private static BigInteger fib(int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(0);
		
		for(int i=2;i<n;i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return b;
	}
}
