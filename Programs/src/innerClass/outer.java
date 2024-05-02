package innerClass;

public class outer {
	
	public class inner{
		
		//inner class methods can't be static 
		
//		public static void main(String[] args) {
//			System.out.println("Hello World");
//		}
		
		public void inner_display() {
			System.out.println("Inside the inner class");
		}
		
	}
	
	public void outer_display() {
		System.out.println("Inside the outer class");
	}
}
