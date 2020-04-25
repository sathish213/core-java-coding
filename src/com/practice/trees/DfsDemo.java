package com.practice.trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DfsDemo {
    private int V;
    private LinkedList<Integer> adj[];

    DfsDemo(int V){
        this.V = V;
        adj = new LinkedList[V];
        for (int i=0; i<V; ++i)
            adj[i] = new LinkedList();
    }

    void dFS(int v){
        Boolean[] b = new Boolean[V];

        dFSUtil(v, b);
    }

    private void dFSUtil(int v, Boolean[] b) {
        b[v] = true;
        System.out.println(v);

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int value = i.next();
            System.out.println("value: "+value+" "+b.length);
            System.out.println("b value: "+b[0]);
            if (!b[value]){
                b[value] = true;
                dFSUtil(value, b);
            }
        }

    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }

    public static void main(String[] args) {
        DfsDemo g = new DfsDemo(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dFS(2);


    }
}
