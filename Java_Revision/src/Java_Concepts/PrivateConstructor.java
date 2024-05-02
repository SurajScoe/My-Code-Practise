package Java_Concepts;

public class PrivateConstructor {
	
	//create private constructor
	private PrivateConstructor() {
		
	}
	
	//Now create private static variable
	private static PrivateConstructor instance;
	
	//Now create static method
	public static PrivateConstructor MyMethod() {
		if(instance==null) {
			instance = new PrivateConstructor();
		}
		
		return instance;
	}
	public static void main(String[] args) {
		PrivateConstructor obj = PrivateConstructor.instance;
		System.out.println(obj);
	}
}
