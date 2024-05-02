package patternproblems;

public class trinagle {
	public static void main(String[] args) {
		/*  
		 * int n = 5;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
O/P:
*
**
***
****
		*/
		
		
		/*
		 * 
		int n = 5;
		for (int i = 1; i < n; i++) {
			for (int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
O/P:
   *
  **
 ***
****
		
		*/
		
		/*
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
O/P:	
	*
   ***
  *****
 *******
*********
		*/
		
		
		/*Square with hollow pattern
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
O/P:		
*****
*   *
*   *
*   *
*****
		*/
		
		/*Number Triangular
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
O/P:
 	1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
		
		
		
		*/
		
		
		/*Number Increasing Pyramid
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
O/P:
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
		
		*/
		
		/*
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n-i; j++) {
				System.out.print(j+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
O/P:
			1 2 3 4  
			1 2 3   
			1 2    
			1
		*/
		
		/*
		int n = 5;
		int index = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(index+" ");
				index++;
			}
			System.out.println();
		}
		
		O/P :
			1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15
			*/
		
		
		
		
		
	}
}
