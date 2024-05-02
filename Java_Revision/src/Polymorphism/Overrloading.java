package Polymorphism;

public class Overrloading {
	
	public void display(String str) {
		System.out.println("This display method with "+str+" parameter !!");
	}
	
	public void display() {
		System.out.println("This display method with no parameters !!");
	}
	
	public int display(int num) {
		System.out.println("This display method with return type as int parameter !!");
		return num;
	}
	
	public static void main(String[] args) {
		Overrloading obj = new Overrloading();
		obj.display("suraj");
		obj.display(1);
		obj.display();
	}
}
