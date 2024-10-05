import java.util.*;

public class PrimMST {
    private static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private static class Graph {
        private final List<List<Edge>> adjList;

        Graph(int vertices) {
            adjList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void addEdge(int src, int dest, int weight) {
            adjList.get(src).add(new Edge(dest, weight));
            adjList.get(dest).add(new Edge(src, weight)); // For undirected graph
        }

        void primMST() {
            int vertices = adjList.size();
            boolean[] inMST = new boolean[vertices];
            int[] key = new int[vertices];
            int[] parent = new int[vertices];

            Arrays.fill(key, Integer.MAX_VALUE);
            Arrays.fill(parent, -1);
            key[0] = 0; // Start from the first vertex

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.add(new int[]{0, key[0]});

            while (!pq.isEmpty()) {
                int u = pq.poll()[0];
                inMST[u] = true;

                for (Edge edge : adjList.get(u)) {
                    if (!inMST[edge.dest] && edge.weight < key[edge.dest]) {
                        key[edge.dest] = edge.weight;
                        pq.add(new int[]{edge.dest, key[edge.dest]});
                        parent[edge.dest] = u;
                    }
                }
            }

            printMST(parent);
        }

        void printMST(int[] parent) {
            System.out.println("Edge\tWeight");
            for (int i = 1; i < parent.length; i++) {
                System.out.println(parent[i] + " - " + i + "\t" + key[i]);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        graph.primMST();
    }
}
