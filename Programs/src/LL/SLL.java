package LL;

import Node.Node;

public class SLL {
	
	//init the head here
	private Node head;
	
	
	public Node getHead() {
		return head;
		
	}
	
	//constr
	//on creating the constr init the head as null
	public SLL() {
		head = null;
	}
	
	//insert the data in SLL
	public boolean insert(int data) {
		
		//step1 : check the new is not null or null
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		
		//step2 : insert at first pos
		//check head equ null if it is then
		// add new node the head
		// this means there no node present so insert one
		if(head == null) {
			head = newNode;
			return true;
		}
		
		
		Node last = head;
		while(last.getNext() != null) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		return true;
		
	}
	
	//step3 :
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.getData()+ " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	//step4 : insert by pos
	public boolean insert(int data,int pos) {
		if(pos <= 0) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		
		//if pos = 1 then the newNode next 
		//to head and head equ to the newNode
		if(pos==1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		
		//if pos is not 1
		Node prev = head;
		for(int i=0;i<pos-1;i++) {
			prev = prev.getNext();
			
			if(prev == null) {
				return false;
			}
		}
		
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		
		return true;
		
	}
	
	public void display(Node firstNode) {
		if(firstNode==null) {
			System.out.println();
			return;
		}
		
		System.out.print(firstNode.getData()+" ");
		display(firstNode.getNext());
		
	}
	
	public void displayRev(Node firstNode) {
		if(firstNode == null) {
			System.out.println();
			return;
		}
		displayRev(firstNode.getNext());
		System.out.print(firstNode.getData()+" ");
	}
	
	
}
