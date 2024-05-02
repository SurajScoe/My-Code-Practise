package Queues;

public class queue {
	private int arr[];
	private int size;
	private int rearer;//insert
	private int front;//export
	
	public queue(int size) {
		this.size = size;
		rearer=front=-1;
		arr = new int[size];
	}
	
	public boolean isFull() {
		return rearer==size-1;
	}
	
	public boolean isEmpty() {
		return (rearer=front)==-1 && (front>rearer);
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		
		arr[++rearer]=data;
		return true;
	}
	
	public int delete() {
		if(isEmpty()) {
			return -1;
		}
	     return arr[++front];
	}
	
	
	
}
