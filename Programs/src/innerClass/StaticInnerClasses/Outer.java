package innerClass.StaticInnerClasses;

public class Outer {
	
//	Static nested classes are not technically inner classes. They are like a static member of outer class. 
	
	private static void display_outer() {
		System.out.println("Inside the outer class of outer !!");
	}
	
	static class inner{
		public static void display_inner() {
			System.out.println("Inside the outer class of inner Class !!");
			display_outer();
		}
		
		
		
		
		
	}
	
}
