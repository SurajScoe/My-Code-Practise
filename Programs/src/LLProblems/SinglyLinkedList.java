package LLProblems;

public class SinglyLinkedList {
	Node head;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode==null)
			return false;
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node last = head;
		
		while(last.getNext()!=null) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		return true;
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public int findSecondLastPos() {
		Node temp = head;
		while(temp.getNext().getNext()!=null) {
			temp = temp.getNext();
		}
		return temp.getData();
	}
	
	public boolean findByPos(int pos) {
		Node temp = head;
		
		for(int i=1;i<pos;i++) {
			if(temp==null)
				return false;
			temp = temp.getNext();
		}
		
		System.out.println(temp.getData());
		return true;
		
	}
	
	public boolean findByData(int data) {
		Node temp = head;
		
		while(temp.getNext()!=null) {
			if(temp.getData()!=data) {
				temp = temp.getNext();
			}
		}
		
		System.out.println(temp.getData());
		return true;
		
	}
	
	
	public boolean insert(int data, int pos) {
		Node newNode = new Node(data);
		Node prev = head;
		if(newNode==null) {
			return false;
		}
		
		if(pos==1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		
		for(int i=1;i<pos-1;i++) {
			prev = prev.getNext();
			if(prev==null)
				return false;
		}
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		
		return false;	
	}
}
