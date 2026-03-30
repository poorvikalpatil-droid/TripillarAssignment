package com.assignment5.module14;

import java.util.ArrayList;

public class GraphCount9 {
    public static void main(String[] args) {
        int V = 3;
        int edges = 0;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);

        for (int i = 0; i < V; i++)
            edges += adj.get(i).size();

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges);
    }
}
