package Graph.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class j01_storingInList {
    public static void main(String[] args) {

        int n = 4; // nodes
        int m = 5; // edges

        // create a GRAPH list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // add the nodes to graph
        for (int i = 1; i <= n + 1; i++) {
            graph.add(new ArrayList<>()); // basically each node can be connected to multiple node
        }

        // Add m dummy edges manually
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);

        // Print the graph
        printGraph(graph);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        // Go to each graph and print the list that every node contains
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Node " + i + " is connected to: ");
            // Iterate to each index sublist
            System.out.println("All Nodes: " + graph.get(i));
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // for undirected graph only
    }
}
