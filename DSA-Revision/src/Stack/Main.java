package Stack;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		stack<Integer> s = new stack(4);
		
		
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		
		System.out.println(s.pop());

	}
		

}
