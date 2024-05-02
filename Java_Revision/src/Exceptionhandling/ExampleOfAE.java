package Exceptionhandling;

public class ExampleOfAE {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		try {
			c = 0 / 10;
			throw new ArithmeticException("can't divide by zero");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("This is exception handling");
		}
	}
}
