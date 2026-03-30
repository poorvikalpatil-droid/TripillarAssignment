package com.assignment5.module14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBipartite7 {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        int color[] = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        boolean isBipartite = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj.get(node)) {
                if (color[n] == -1) {
                    color[n] = 1 - color[node];
                    q.add(n);
                } else if (color[n] == color[node]) {
                    isBipartite = false;
                }
            }
        }

        System.out.println(isBipartite);
    }
}
