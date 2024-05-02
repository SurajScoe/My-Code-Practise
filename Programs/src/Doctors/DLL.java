package Doctors;

public class DLL {
	
	Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public DLL() {
		head = null;
	}
	
	public boolean insertAtFirstPos(Doctors data) {
		Node newNode = new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head = newNode;
			return true;
		}
		
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		return true;
		
		
	}
	
	
	public boolean InsertAtLastpos(Doctors data) {
		Node newNode = new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		newNode.setPrev(temp);
		
		return true;
		
		
	}
	
	
	public boolean deleteFromBegining() {
		if(head==null) {
			return false;
		}
		
		if(head.getNext()==null) {
			head = null;
			return true;
		}
		head = head.getNext();
		head.setPrev(null);
		return true;
	}
	
	public boolean deleteFromEnd() {
		if(head==null) {
			return false;
		}
		
		Node temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		
		
		temp.getPrev().setNext(null);
		return true;
		
	}
	
	
	
	
	
	public void display() {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.getData()+"==>");
			temp=temp.getNext();
		}
		System.out.println();
	
	}
}
