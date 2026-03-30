package com.assignment5.module14;

import java.util.ArrayList;

public class GraphCycle4 {
    static boolean dfs(int node, int parent, boolean visited[], ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int n : adj.get(node)) {
            if (!visited[n]) {
                if (dfs(n, node, visited, adj))
                    return true;
            } else if (n != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        boolean visited[] = new boolean[V];

        System.out.println(dfs(0, -1, visited, adj));
    }
}
