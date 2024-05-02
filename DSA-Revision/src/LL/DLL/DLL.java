package LL.DLL;



public class DLL {
	private DLLNode head;

	public DLLNode getHead() {
		return head;
	}

	public void setHead(DLLNode head) {
		this.head = head;
	}

	public DLL() {
		super();
		this.head = null;
	}
	
	public boolean insert(int data) {
		
		DLLNode newNode = new DLLNode(data);
		
		if(newNode==null) {
			return false;
		}
		
		//insert at 1st pos
		if(head == null) {
			head = newNode;
			return true;
		}
		
		//insert at non 1st pos
		DLLNode last = head;
		
		while(last.getNext() != null) {
			last=last.getNext();
		}
		
		last.setNext(newNode);
		newNode.setPrev(last);
		
		return true;
		
	}
	
	public boolean insert(int data, int pos) {
		
		
		if(pos<1) {
			return false;
		}
		
		DLLNode newNode = new DLLNode(data);
		
		if(newNode == null) {
			return false;
		}
		
		
		if(pos == 1) {
			if(head == null) {
				head = newNode;
			}
			
			newNode.setNext(head);
			head.setPrev(newNode);
			return true;
		}
		
		DLLNode prev = head;
		
		for(int i=1;i<pos-1;i++) {
			prev = prev.getNext();
			if(prev == null) {
				return false;
			}
		}
		
		newNode.setPrev(prev);		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		
		prev.getNext().setPrev(newNode);
		
		
		return true;
		
		
	}
	
	
	
	public void display() {
		
		
		DLLNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
		temp = temp.getNext();
		}
		System.out.println();
		
	}
	
	
	public boolean deleteByvalue(int data) {
		
		if(head==null) {
			return false;
		}
		
		//REM
		if(head.getData()==data) {
			head = head.getNext();
			if(head != null)
			head.setPrev(null);
			return true;
		}
		
		
		
		DLLNode del = head;
		
		while(del.getData()!=data) {
			del = del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		del.getPrev().setNext(del.getNext());
		
		if(del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		
		return true;
		
	}
	
	
	public boolean deleteByPos(int pos) {
		if(head == null) {
			return false;	
		}
		
		//REM
		if(pos==1) {
			head = head.getNext();
			if(head != null) {
				head.setPrev(null);
			}
			return true;
		}
		
		DLLNode del = head;
		
		for(int i=1;i<pos;i++) {
			del = del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		del.getPrev().setNext(del.getNext());
		if(del.getNext()!=null)
		del.getNext().setPrev(del.getPrev());
		
		return true;
		
	}
	
	public void displayRev() {
		if(head == null) {
			return ;
		}
		
		DLLNode temp = head;
		
		while(temp.getNext()!=null){
			temp = temp.getNext();
		}
		
		while(temp != null) {
			System.out.print(temp.getData()+"===>");
			temp = temp.getPrev();
		}
		
		System.out.println();
		
		
	}

	
	
	
	
	
}
