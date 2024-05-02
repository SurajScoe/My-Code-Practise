package Graphs;

import java.util.Iterator;
import java.util.Stack;

public class Graph {
	//No of vertices
	private int noOfVertices;
	// vertices array
	private char[] vertices;
	// adjenecy matrix
	private int[][] adjMat;
	
	
	//Constr
	public Graph(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		vertices = new char[noOfVertices];
		adjMat = new int[noOfVertices][noOfVertices];
	}
	
	public void intt() {
		for (int i = 0; i < noOfVertices; i++) {
			vertices[i] = (char)(65+i);
		}
		
		int inputArr[] = {0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
		
		int k = 0;
		
		for(int i=0; i<noOfVertices;i++) {
			for (int j = 0; j < noOfVertices; j++) {
				adjMat[i][j] = inputArr[k++];
			}
		}
	}
	
	
	public void display() {
		System.out.println();
		System.out.println(" ");
		for (int i = 0; i < noOfVertices; i++) {
			System.out.print(vertices[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < noOfVertices; i++) {
			System.out.println(vertices[i]+" ");
			
			for (int j = 0; j < noOfVertices; j++) {
				System.out.println(adjMat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public void dfs(int v) {
		System.out.println("DFS : ");
		
		int []visited = new int[noOfVertices];
		Stack<Integer> stk = new Stack<>();
		
		System.out.println(vertices[v]);
	}
}
