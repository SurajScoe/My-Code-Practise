package BST;

public class Main {
	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.insert(50);
        bst.insert(20);
        bst.insert(80);
        bst.insert(10);
        bst.insert(40);
        bst.insert(60);
        bst.insert(90);
        bst.insert(15);
        bst.insert(70);
        bst.insert(30);
        
//        bst.preOrder();
        
        System.out.println("\nInOrder Trav : \n");
        
        bst.inOrder();
        
        
	}
}
