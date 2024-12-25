import java.util.*;

public class DirectedUnweightedGraph {
    
    static class Edge {
        int s;
        int d; 

        Edge(int s, int d) {
            this.s = s;
            this.d = d;
        }
    }

    int V; 
    ArrayList<Edge>[] graph;

    
    DirectedUnweightedGraph(int V) {
        this.V = V;
        this.graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
    }

    
    public void addEdge(int s, int d) {
        Edge edge = new Edge(s, d);
        graph[s].add(edge);
    }

   
    public void print() {
        for (int i = 0; i < V; i++) {
            ArrayList<Edge> currentList = graph[i];
            System.out.print("Vertex " + i + " edges: ");
            for (Edge e : currentList) {
                System.out.print("->" + e.d + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        DirectedUnweightedGraph g1 = new DirectedUnweightedGraph(4);

       
        g1.addEdge(0, 1);
        g1.addEdge(0, 3);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);

       
        g1.print();
    }
}
