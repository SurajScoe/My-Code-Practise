package DailyProbs;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int row = scanner.nextInt();
        
//        
        
        int[][] triangle = new int[row][row];
        for(int i=0;i<row;i++) {
        	for(int j=0;j<=i;j++) {
        		if(j==0 || j==i) {
        			triangle[i][j]=1;
        		}else {
        			triangle[i][j]=triangle[i-1][j-1] + triangle[i-1][j];
        		}
        	}
        }
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(triangle[i][j]+" ");
        	}
        	System.out.println();
        }

    }
}
