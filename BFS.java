import java.util.*;

public class BFSGraph {
    private int V; 
    private LinkedList<Integer>[] adjacencyList; 

    
    public BFSGraph(int V) {
        this.V = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int d) {
        adjacencyList[s].add(d); 
    }

    
    public void bfs(int start) {
       
        boolean[] visited = new boolean[V];
       
        Queue<Integer> queue = new LinkedList<>();
        
        visited[start] = true;
        queue.add(start);

        System.out.println("BFS traversal starting from vertex " + start + ":");
        while (!queue.isEmpty()) {
           
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjacencyList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        BFSGraph graph = new BFSGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.bfs(0);
    }
}
