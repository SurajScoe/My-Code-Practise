package ThreadPart1AndPart2;
/*in case t.start() a new thread created for
which responsible for the execution of run method


Start() will do 
{
==> it considered as heart of mutithreading
==> register this thread  with Thread sheduler
==> Perform all other mandatory activities
==> Invoke the run()
==> Overrloading of run() : is always possible but thrwad class
start() can invoke no-arg run() the other overloaded method we 
have to call explicitly like normal method call.
==> 
}				
*/


/*In case of t.run a new thread won't be create 
 * and run method executed just like main thread
 * it executed like normal method
 * 
 hence above program t.start replace with t.run then
 output is child thread 10x and main thread 10x
 
 overrloading of run() possible or not ==> yes possible
 
 */
public class MyProg{
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread");
//		}
		
	}
}

class MyThread extends Thread{
	public void run() {
		System.out.println("no-arg method");
	}
	
	public void run(int i) {
		System.out.println(i+"int arg method");
	}
}
