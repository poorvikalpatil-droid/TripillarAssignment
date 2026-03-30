package com.assignment5.module14;

import java.util.ArrayList;

public class GraphComponents5 {
    static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int n : adj.get(node)) {
            if (!visited[n])
                dfs(n, visited, adj);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(3).add(4);
        adj.get(4).add(3);

        boolean visited[] = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                count++;
            }
        }

        System.out.println("Components: " + count);
    }
}
