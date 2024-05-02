package Polymorphism;

public class Overriding {
	
	public static void main(String[] args) {
		subclass obj1 = new subclass();
		obj1.display();
		
		superclass obj2 = new superclass();
		obj2.display();
		
		superclass obj3 = new subclass();
		obj3.display();
		
		subclass obj4 = (subclass) new superclass();
		obj4.display();//gives classCastExc
	}
}

class superclass{
	public void display() {
		System.out.println("Inside the super class");
	}
}

class subclass extends superclass{
	
	public void display() {
		System.out.println("Inside the sub class");
	}
}
