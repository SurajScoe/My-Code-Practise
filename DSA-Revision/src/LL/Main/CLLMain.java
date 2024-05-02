package LL.Main;

import LL.CL.CL;

public class CLLMain {
	public static void main(String[] args) {
		CL l = new CL();
		
		l.insert(1);
		l.insert(11);
		l.insert(12);
		l.insert(13);
		l.insert(13);
		l.display();
		
//		l.deleteByvalue(1);
//		l.display();
		
		l.deleteByPos(1);
		l.deleteByPos(3);
		l.deleteByPos(1);
		l.display();
		
	}
}
