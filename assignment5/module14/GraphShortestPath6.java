package com.assignment5.module14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphShortestPath6 {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);

        int dist[] = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        dist[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj.get(node)) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println("Distance to 3: " + dist[3]);
    }
}
