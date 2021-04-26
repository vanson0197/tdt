package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Graph {
    private int v;
    private LinkedList<Integer> arr[];

    Graph(int v) {
        this.v = v;
        arr = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    void addEdge(int p, int q) {
        arr[p].add(q);
    }

    public void BFS(int s) {
        boolean visited[] = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> itr = arr[s].listIterator();
            while (itr.hasNext()){
                int n = itr.next();
                if( !visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public void DFSUtil(int i, boolean visited[]){
        visited[i] = true;
        System.out.print(i + " ");
        Iterator<Integer> itr = arr[i].listIterator();
        while ( itr.hasNext()){
            int n = itr.next();
            if(!visited[n]){
                DFSUtil(n, visited);
            }

        }

    }
    public  void DFS(int i){
        boolean visited[] = new boolean[v];
        DFSUtil(i, visited);
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
        System.out.println();
        g.DFS(2);
    }


}
