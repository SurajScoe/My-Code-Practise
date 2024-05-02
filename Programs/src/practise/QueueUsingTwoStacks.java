package practise;

import java.util.Stack;

public class QueueUsingTwoStacks {
	
	static Stack<Integer> stk1 = new Stack<>();
	static Stack<Integer> stk2 = new Stack<>();
	
	static class Queue{
		public static void enQueue(int elem) {
			//move all elements from stk1 to stk2
			while(!stk1.isEmpty()) {
				stk2.push(stk1.pop());
			}
			
			stk1.push(elem);//push elem into stk1
			
			//Now push everything back to stk1
			while(!stk2.isEmpty()) {
				stk1.push(stk2.pop());
			}
			
			
		}
		
		
		//Dequeue elem from queue
		public static int deQueue() {
			if(stk1.isEmpty())
				return -1;
			
			int elem = stk1.peek();
			stk1.pop();
			return elem;
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		Queue.enQueue(0);
		Queue.enQueue(1);
		Queue.enQueue(2);
		Queue.enQueue(3);
		Queue.enQueue(4);
		
		System.out.println(Queue.deQueue());
		
	}
}
