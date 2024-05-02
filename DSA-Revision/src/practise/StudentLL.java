package practise;

public class StudentLL {
	Node head;
	public StudentLL() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public boolean insert(Student data) {
		
		
		Node newNode = new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
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
		if(head==null) {
			return ;
		}
		
		
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	

}
