package CodingNinja.Graph;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int v1;
    int v2;
    int weight;

    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class KrushalAlgo {

    public static int findParent(int V, int[] parent) {
        if (V == parent[V]) {
            return V;
        }

        return findParent(parent[V], parent);
    }

    public static Edge[] kurskalAlgo(Edge[] edges, int n) {
        Arrays.sort(edges);

        Edge[] mst = new Edge[n - 1];
        int[] parent = new int[n];

        for (int j = 0; j < parent.length; j++) {
            parent[j] = j;
        }

        int count = 0;
        int i = 0;

        while (count != n - 1) {

            Edge currentEdge = edges[i++];
            int v1ParentIndex = findParent(currentEdge.v1, parent);
            int v2ParentIndex = findParent(currentEdge.v2, parent);

            if(v1ParentIndex != v2ParentIndex) {
                mst[count] = currentEdge;
                count++;
                parent[v1ParentIndex] = v2ParentIndex;
            }
        }
        return mst;
    }

    public static void printMST(Edge[] mst) {
        for(int i = 0; i < mst.length; i++) {
            if (mst[i].v1 < mst[i].v2) {
                System.out.println(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].weight);
            } else {
                System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        Edge[] edges = new Edge[V];

        for (int i = 0; i < V; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();

            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }

        Edge[] mst = kurskalAlgo(edges, V);

        printMST(mst);

    }
}