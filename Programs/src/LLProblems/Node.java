package LLProblems;

public class Node {
	private int data;
	private Node next;
	
	//Getter and Setter
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	//constructor
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insert(1);
		sll.insert(2);
		sll.insert(3);
		sll.insert(4);
		sll.display();
		
//		System.out.println(sll.findSecondLastPos());
//		
//		System.out.println(sll.findByPos(4));
//		
//		System.out.println(sll.findByData(2));
		
		System.out.println(sll.insert(11,5));
		
		sll.display();
	}
	
	
	
}
