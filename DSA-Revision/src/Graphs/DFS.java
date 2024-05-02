package Graphs;

import java.util.Stack;
/*Depth First Search*/
public class DFS {
    public static void dfsWithStack(int[][] graph, int start) {
        int numNodes = graph.length;
        boolean[] visited = new boolean[numNodes];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");

                for (int neighbor = numNodes - 1; neighbor >= 0; neighbor--) {
                    if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0}
        };

        System.out.println("DFS using stack starting from node 0:");
        dfsWithStack(graph, 0);
    }
}
