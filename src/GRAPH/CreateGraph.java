package GRAPH; // under this pakage 

import java.util.ArrayList; //importing the utilities

public class CreateGraph { // this class is gonna help creatig the graph by using the edge class

    public static ArrayList<Edge>[] createGraph(int vertices) { // returns the arraylist of edges
        @SuppressWarnings("unchecked") // it was annoying me
        ArrayList<Edge>[] graph = new ArrayList[vertices]; // creating the arraylist
        // here we are gonna initalize the arraylist with the number of vertices
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        return graph;// return the graph arfer creating it
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) { // takes the array list and adds edge to it
        graph[src].add(new Edge(src, dest)); // adds new edge
    }
}
