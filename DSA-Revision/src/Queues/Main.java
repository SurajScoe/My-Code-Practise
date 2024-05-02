package Queues;

public class Main {
	public static void main(String[] args) {
		queue q = new queue(5);
		
		System.out.println(q.insert(1));
		q.insert(2);
		q.insert(33);
		q.insert(4);
		q.insert(0);
		
		
		
		
		q.delete();
	}
}
