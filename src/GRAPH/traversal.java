package GRAPH; //under this pakage

//importing utilities
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class traversal { // traversal class that contains all type of traversals

    public static void bfs(ArrayList<Edge>[] g, int start) { // for bfs
        HashSet<Integer> h = new HashSet<>(); // initializing hashset
        Queue<Integer> q = new LinkedList<Integer>(); // initializing queue
        h.add(start); // already visited the start nnode
        q.add(start); // add it to queue

        System.out.println("BFS traversal from the starting node-: "); // start the traversal

        while (!q.isEmpty()) { // base case
            int curr = q.poll(); // get the current node nd remmove it from the queue
            System.out.print(curr + " "); // print the node with a space after it

            // Explore all the adjecent vertices
            for (Edge edge : g[curr]) {
                int neighbour = edge.dest; // get the 1st neighbour
                if (!h.contains(neighbour)) { // check if we already visited it
                    h.add(neighbour);// add it to the checker
                    q.add(neighbour); // add it to the queue
                }
            }
        }
        System.out.println(); // for a new line after BFS is done
    }

    /************* DFS TRAVERSAL */
    public static void dfs(ArrayList<Edge>[] g, int start) {
        HashSet<Integer> h = new HashSet<>();
        System.out.println("THE DFS IS --> ");
        dfshelper(g, start, h);
        System.out.println(); // new line after DFS traversal
    }

    public static void dfshelper(ArrayList<Edge>[] g, int start, HashSet<Integer> h) {
        h.add(start); // mark node as visited
        System.out.print(start + " "); // print the current node

        for (Edge edge : g[start]) { // explore all adjacent vertices
            int n = edge.dest;
            if (!h.contains(n)) { // if not visited, recursively call dfshelper
                dfshelper(g, n, h);
            }
        }
    }
}
