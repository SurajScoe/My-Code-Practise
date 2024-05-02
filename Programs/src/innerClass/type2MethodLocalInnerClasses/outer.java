package innerClass.type2MethodLocalInnerClasses;

// Java Program to Illustrate Inner class can be
// declared within a method of outer class 

// Class 1
// Outer class
class Outer {
	
	
	int x = 100;
	// Method inside outer class
	void outerMethod()
	{
		
		
		/*Method local inner class can’t be marked as private, protected, static, and transient but can be marked as abstract and final, but not both at the same time.*/
		
		// Print statement
		System.out.println("inside outerMethod");

		// Class 2
		// Inner class
		// It is local to outerMethod()
		class Inner {
			
			int y = 100;
			// Method defined inside inner class
			void innerMethod()
			{

				// Print statement whenever inner class is
				// called
				System.out.println("inside innerMethod");
				System.out.println(++x);
			}
		}


		// Creating object of inner class
		Inner y = new Inner();

		// Calling over method defined inside it
		y.innerMethod();
	}
}


