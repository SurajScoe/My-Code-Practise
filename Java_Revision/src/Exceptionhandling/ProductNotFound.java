package Exceptionhandling;

public class ProductNotFound extends Exception {
	static String str = "Product key is invalid try some other key !!";
	public ProductNotFound() {
		// TODO Auto-generated constructor stub
		super(str);
	}
	
}
