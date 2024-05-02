package BST;

import java.util.Stack;
/*BST i.e. Binary Search Tree*/
public class BST {
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public boolean insert(int data) {
		
		
		Node newNode = new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node temp = root;
		
		//Duplicate value not allowed
		
		while(true) {
		if(temp.getData()==data) {
			return false;
		}
		
		//value is less than the root then add it to the left child
		if(temp.getData()>data) {
			while(temp.getLeft()==null) {
				temp.setData(data);
				System.out.println(data+"inserted on left");
				return true;
			}
			temp = temp.getLeft();
		}
		else {
			while(temp.getRight()==null) {
				temp.setData(data);
				System.out.println(data+"inserted on rigth");
				return true;
			}
			temp = temp.getRight();
		}
		}	
	}
	
	
	//Now ROOT LEFT RIGTH (NLR)
	public void preOrder() {
		Node temp = root;
		
		Stack<Node> stk = new Stack<>();
		
		
		while(temp!=null || !stk.empty()) {
			//here first get all the left child of tree
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				stk.push(temp);
				temp = temp.getLeft();
			}
			//Now pop the node from stak
			temp = stk.pop();
			temp = temp.getRight();
		}
		System.out.println();
	}
	
	
	//Now Inorder Trav : LNR
	public void inOrder() {
		Node temp = root;
		
		Stack<Node> stk = new Stack<>();
		
		while(temp!=null || !stk.empty()) {
			while(temp!=null) {
				stk.push(temp);
				temp = temp.getLeft();
			}
			temp=stk.pop();
			System.out.print(temp.getData());
			temp=temp.getRight();
		}
		System.out.println();
		
		
	}
	
	
}
