package practise;

public class swappTonumbersWithoutTemp {
	public static void main(String[] args) {
		int a = 11;
		int b = 66;
		
		Solution1(a,b);
		Solution2(a, b);
	}

	private static void Solution2(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("before a : "+a +" , "+"b : "+ b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after a : "+a +" , "+"b : "+ b);

	}

	private static void Solution1(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("before a : "+a +" , "+"b : "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After a : "+a +" , "+"b : "+ b);
		
	}
	
	
}
