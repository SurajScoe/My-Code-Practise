package Lab_Session_25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		        Thread thread1 = new Thread(new Runnable() {
		            public void run() {
		                System.out.println("Thread 1 is running");
		            }
		        });

		        Thread thread2 = new Thread(new Runnable() {
		            public void run() {
		                System.out.println("Thread 2 is running");
		            }
		        });

		        thread1.start();
		        thread2.start();
		        
		        
		        
		        
		        prob1 obj = new prob1();
		        Method method = prob1.class.getDeclaredMethod("myPrivateMethod");
		        method.setAccessible(true);
		        method.invoke(obj);
		        
		        
		        
		        
		        Thread thread11 = new Thread(() -> System.out.println("Thread 1 is running"));
		        Thread thread22 = new Thread(() -> System.out.println("Thread 2 is running"));

		        thread11.start();
		        thread22.start();

	}

}
