import java.util.*;

public class DirectedWeightedGraph {
    
    static class Edge {
        int s;
        int d; 
        int w; 

        Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    int V; 
    ArrayList<Edge>[] graph;

   
    DirectedWeightedGraph(int V) {
        this.V = V;
        this.graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
    }

  
    public void addEdge(int s, int d, int w) {
        Edge edge = new Edge(s, d, w);
        graph[s].add(edge);
    }

    public void print() {
        for (int i = 0; i < V; i++) {
            ArrayList<Edge> currentList = graph[i];
            System.out.print("Vertex " + i + " edges: ");
            for (Edge e : currentList) {
                System.out.print("->" + e.d + "(weight: " + e.w + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        DirectedWeightedGraph g1 = new DirectedWeightedGraph(4);

        g1.addEdge(0, 1, 5);
        g1.addEdge(0, 3, 10);
        g1.addEdge(1, 2, 2);
        g1.addEdge(2, 3, 1);

        
        g1.print();
    }
}
