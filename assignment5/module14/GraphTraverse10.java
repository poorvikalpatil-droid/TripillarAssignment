package com.assignment5.module14;

import java.util.ArrayList;

public class GraphTraverse10 {
    static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adj.get(node)) {
            if (!visited[n])
                dfs(n, visited, adj);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        boolean visited[] = new boolean[V];

        dfs(0, visited, adj);
    }
}
