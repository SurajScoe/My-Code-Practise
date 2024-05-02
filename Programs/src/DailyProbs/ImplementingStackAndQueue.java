package DailyProbs;

public class ImplementingStackAndQueue {
	public static int arr[];
	int top;
	int front;
	int rear;
	
	
	public ImplementingStackAndQueue(int size) {
		super();
		this.top = -1;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}
	
	
	public void push(int elem) {
		if(arr.length-1==top) {
			System.out.println("Stack is full");
			return;
		}
		arr[++top] = elem;
	}
	
	
	public void pop(int elem) {
		if(top==-1) {
			
		}
	}
	
	






	public static void main(String[] args) {
		
	}
}
