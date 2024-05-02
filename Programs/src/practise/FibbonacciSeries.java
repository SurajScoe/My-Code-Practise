package practise;

import java.util.Iterator;

public class FibbonacciSeries {
public static void main(String[] args) {
	
	int n = 10;
	
	solution1(n);
//	System.out.println(solution2(n));
}

private static int solution2(int n) {
	// TODO Auto-generated method stub
	
	if(n<=1)
		return 1;
	return solution2(n-1)+solution2(n-2);
}

private static void solution1(int n) {
	// TODO Auto-generated method stub
	int a=0, b=1, c;
	
	System.out.print(a+","+b+",");
	
	for (int i = 2; i <= n; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+",");
	}
//	System.out.println(b);
}
}
