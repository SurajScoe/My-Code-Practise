package LL.CL;

public class CL {
	private CLNode head;
	
	
	public CL() {
		this.head = null;
	}

	public CLNode getHead() {
		return head;
	}

	public void setHead(CLNode head) {
		this.head = head;
	}
	
	public boolean insert(int data) {
		CLNode newNode = new CLNode(data);
		
		if(newNode==null) {
			return false;
		}
		
		//if there is no node in CL so insert at 1st pos
		if(head==null) {
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		
		//insert at last pos
		CLNode last = head;
		
		while(last.getNext()!=head) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		
		newNode.setNext(head);
		
		return true;
	}
	
	//display nodes
	public void display() {
		
		if(head == null) {
			return;
		}
		
		
		
		CLNode temp = head;
		
		do {
			
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
			
			
		} while (temp != head);
		
		System.out.println();
	}
	
	
	//insert by pos
	
	public boolean insert(int data, int pos) {
		
		if(pos <= 0) {
            return false;
        }

        CLNode newNode = new CLNode(data);
        if(newNode == null) {
            return false;
        }
		
		
		//triky
		if(pos==1) {
			//REM
			if(head==null) {
				head = newNode;
				newNode.setNext(newNode);
				return true;
			}
			
			newNode.setNext(head);
			CLNode last = head;
			while(last.getNext() != head) {
				last = last.getNext();
			}
			last.setNext(newNode);
			
			head = newNode;
			
			return true;
		}
		
		
		//if pos is not 1
		
		CLNode prev = head;
		
		for (int i = 1; i < pos-1; i++) {
			prev = prev.getNext();
			if(prev == head)
				return false;
		}
		
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		
		return true;
		
}
	
	//delete by value
	public boolean deleteByvalue(int data) {
		if(head == null) {
			return false;
		}
		
		if(head.getData()==data) {
			
			//if there is only one node 
			if(head.getNext()==head) {
				head = null;
				return true;
			}
			
			//for last node
			//if there is data available
			//get last elements
			CLNode last = head;
			while(last.getNext()!=head) {
				last = last.getNext();
			}
			
			last.setNext(head.getNext());
			
			head = head.getNext();
			return true;
		}
		
		
		// if delNode present somewhere b/w the list
		//locate it and delete it
		
		CLNode prev = head;
		CLNode del = head;
		
		// Locate the del node
		while(del.getData() != data) {
			prev = del;
			del = del.getNext();
			if(del==head) {
				return false;
			}
			
			}
			prev.setNext(del.getNext());
			return true;
		
	}
	
	public boolean deleteByPos(int pos) {
		
		if(head==null || pos<1)
			return false;
		
		if(pos == 1) {
			//REM
			if(head.getNext()==head) {
				head = null;
				return true;
			}
			
			CLNode last = head;
			while(last.getNext()==head) {
				last = last.getNext();
			}
			last.setNext(head.getNext());
			
			head = head.getNext();
			
			return true;
		}
		
		//Not on pos 1 
		CLNode prev = head;
		for (int i = 1; i < pos-1; i++) {
			prev = prev.getNext();
			if(prev.getNext()==head)
				return false;
		}
		
		prev.setNext(prev.getNext().getNext());
		return true;
		
	}
	
}
