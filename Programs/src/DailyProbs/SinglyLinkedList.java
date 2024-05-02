package DailyProbs;

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
}
