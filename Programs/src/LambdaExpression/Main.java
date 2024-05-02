package LambdaExpression;

public class Main {
	public static void main(String[] args) {
		
		//Anonymous class 
		MyInterface obj = new MyInterface() {
			
			@Override
			public void MyHello() {
				// TODO Auto-generated method stub
				System.out.println("Inside the 1st  anonymouse class");
			}
		};	}
}

