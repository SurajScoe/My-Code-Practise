package DailyProbs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplStackUsingQueue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	int curr_size;
	
	//implemented size
	 void push(int x) {
		q2.add(x);
		while(q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		//Swap the names of two queues
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	 
	 //implemented pop
	 void pop() {
		 //if no element are there in q1
		 if(q1.isEmpty())
			 return;
		 q1.remove();
	 }
	 
	 //implemented top
	 int top() {
		 if(q1.isEmpty())
			 return -1;
		 return q1.peek();
	 }
	 
	 //implemented size
	 int size() {
		 return q1.size();
	 }
	public static void main(String[] args) {
		
		ImplStackUsingQueue s = new ImplStackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.top());
		
	}
}
