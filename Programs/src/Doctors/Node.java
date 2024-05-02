package Doctors;

public class Node {
	private Doctors data;
	private Node next;
	private Node prev;
	public Doctors getData() {
		return data;
	}
	public void setData(Doctors data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
	public Node(Doctors data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	
	
}
