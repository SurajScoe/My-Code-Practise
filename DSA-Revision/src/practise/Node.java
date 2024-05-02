package practise;

public class Node {
	Node next;
	Student data;
	public Node(Student data) {
		next = null;
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	
	
	
}
