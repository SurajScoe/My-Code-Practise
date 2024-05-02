package Stack;

public class stack<T> {
	private T[] arr;
	private int size;
	private int top;
	
	public stack(int size) {
		this.size = size;
		top = -1;
		//Array of generic type T
		arr = (T[])new Object[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	public boolean isFull() {
		return top == size-1;
	}
	
	
	public boolean push(T data) {
		if(isFull())
			return false;
		arr[++top] = data;
		return true;
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		
		return arr[top--];
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
}
