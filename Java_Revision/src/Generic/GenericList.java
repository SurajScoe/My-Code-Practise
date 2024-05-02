package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("suraj");
		list.add("malge");
		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str); // gives classCastException
//		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
