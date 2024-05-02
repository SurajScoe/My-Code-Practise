package Main;

import LL.SLL;
import Node.Node;

public class SLLMain {
	public static void main(String[] args) {
		SLL l = new SLL();
		
		l.display();
		l.insert(10);
		
		l.insert(11);
		
		l.insert(12);
		
		l.insert(13);
		
		l.insert(14);
		
		l.insert(15);
		
		l.display();
		
		
		l.displayRev(l.getHead());
		
	}
}
