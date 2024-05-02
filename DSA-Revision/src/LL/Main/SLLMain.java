package LL.Main;

import LL.Node.Node;
import LL.SLL.SLL;

public class SLLMain {
	public static void main(String[] args) {
		SLL l = new SLL();
		
//		l.display();
		l.insert(10);
		
		l.insert(11);
		
		l.insert(12);
		
		l.insert(13);
		
		l.insert(14);
		
		l.insert(15);
		
		l.display();
		
		l.deleteByPos(4);
		l.deleteByvalue(15);
		l.display();
		
		l.insert(100, 1);
		l.display();
		
		l.displayRev(l.getHead());
		
		l.reverseLL();
		l.display();
		
	}
}
