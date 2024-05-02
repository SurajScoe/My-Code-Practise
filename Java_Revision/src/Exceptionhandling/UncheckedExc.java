package Exceptionhandling;

public class UncheckedExc {
	
	static String[] str = {"shoe","chair","table","fan"};
	static int len = str.length;
	
	public static void bring(int n) throws Exception{
		if(n>=len || len<0) {
			throw new ProductNotFound();
		}else {
			System.out.println(str[n-1]);
		}
	}
	public static void main(String[] args) throws ProductNotFound {
		System.out.println("Fetching some product");
	}
}
