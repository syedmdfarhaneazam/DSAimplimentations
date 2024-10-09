package GRAPH; // under this pakage

//importing utilities

import java.util.ArrayList;
import java.util.Scanner;

public class GraphUse { // here we are gonna use everything we created in this pakage
    public static void main(String[] args) { // here we run the main funtction
        @SuppressWarnings("unchecked") // it was annoying me again in this file
        Scanner sc = new Scanner(System.in); // creating a scanenr
        System.out.print("Enter the number of vertices: "); // take the number of vertices
        int vertices = sc.nextInt();
        ArrayList<Edge>[] graph = CreateGraph.createGraph(vertices); // creats a graph arraylist
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt(); // takes in the number of edges
        // here for each edge we are gonna enter the source and estination
        System.out.println(
                "Enter the edges (source and destination)(enter no/n if you dont want to give any more links)->");
        while (true) {
            try {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                CreateGraph.addEdge(graph, src, dest);
            } catch (java.util.InputMismatchException e) {
                break;
            }
        }

        System.out.println("Graph created with the following edges:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Edge edge : graph[i]) {
                System.out.print(edge.dest + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
