package LL.CL;

public class CLNode {
	private CLNode prev;
	private CLNode next;
	private int data;
	
	
	
	
	
	
	public CLNode(int data) {
		super();
		this.prev = null;
		this.next = null;
		this.data = data;
	}
	public CLNode getPrev() {
		return prev;
	}
	public void setPrev(CLNode prev) {
		this.prev = prev;
	}
	public CLNode getNext() {
		return next;
	}
	public void setNext(CLNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
}
