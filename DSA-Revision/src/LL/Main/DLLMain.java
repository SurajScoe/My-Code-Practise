package LL.Main;

import LL.DLL.DLL;

public class DLLMain {
	public static void main(String[] args) {
		
		DLL l = new DLL();
		
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		
		l.display();
		
//		l.insert(121, 3);
//		l.display();
		
//		l.deleteByvalue(4);
//		l.deleteByvalue(1);
//		l.display();
		
		
		//delete by pos
//		l.deleteByPos(2);
//		l.display();
		
		
		//rev display
		l.displayRev();
		
		

	}
}
