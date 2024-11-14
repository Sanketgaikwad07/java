import java.util.Arrays;

class Edge {
    int src, dest, weight;
    
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class BellmanFord {

    private int V, E;  // Number of vertices and edges
    private Edge[] edges;

    // Constructor to initialize the graph
    public BellmanFord(int v, int e) {
        this.V = v;
        this.E = e;
        edges = new Edge[E];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge(0, 0, 0);
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int index, int u, int v, int weight) {
        edges[index] = new Edge(u, v, weight);
    }

    // Bellman-Ford algorithm to find the shortest path
    public void bellmanFord(int src) {
        // Initialize distances from src to all other vertices as infinity
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax all edges V - 1 times
        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; j++) {
