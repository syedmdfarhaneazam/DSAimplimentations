package GRAPH; //under this pakage

//importing utilities

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class traversal { // traversal class that contains all type of traversals
    public static HashSet<Integer> h; // to keep a track of the edges that we have
    public static Queue<Integer> q; // to keep track of neighbours

    public static void bfs(ArrayList<Edge>[] g, int start) { // for bfs
        h = new HashSet<>(); // initializing hashset
        q = new LinkedList<Integer>(); // initializing queue
        h.add(start); // already visited the start nnode
        q.add(start); // add it to queue

        System.out.println("BFS traversal from the starting node-: "); // start the traversal

        while (!q.isEmpty()) { // base case
            int curr = q.poll(); // get the current node nd remmove it from the queue
            System.out.print(curr + "-"); // print the node

            // Explore all the adjecent vertices
            for (Edge edge : g[curr]) {
                int neighbour = edge.dest; // get the 1st neighbour
                if (!h.contains(neighbour)) { // check if we already visited it
                    h.add(neighbour);// add it to the checker
                    q.add(neighbour); // add it to the queue
                }
            }
        }
    }
}
