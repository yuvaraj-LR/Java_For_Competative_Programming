package CodingNinja.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

    private static void  DFSHelper(int[][] adjMatrix, int currentVertices, boolean[] isVisited) {
        System.out.print(currentVertices + " ");
        isVisited[currentVertices] = true;

        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertices][i] == 1 && !isVisited[i]) {
                DFSHelper(adjMatrix, i, isVisited);
            }
        }
    }

    public static void DFS(int[][] adjMatrix) {
        boolean[] isVisited = new boolean[adjMatrix.length];
        DFSHelper(adjMatrix, 0, isVisited);
    }

    public static void BFS(int[][] adjMatrix) {
        boolean[] isVisited = new boolean[adjMatrix.length];
        isVisited[0] = true;

        Queue<Integer> pendingVertices = new LinkedList<>();
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()) {
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !isVisited[i]) {
                    isVisited[i] = true;
                    pendingVertices.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = new int[n][n];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        BFS(graph);

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//
//            System.out.println();
//        }
    }


}
