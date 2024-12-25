import java.util.*;

public class Main {
    private int V; 
    private LinkedList<Integer>[] adjacencyList; 

    public Main(int V) 
    {
        this.V = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int d) 
    {
        adjacencyList[s].add(d); 
    }

    public void bfsRecursive(int start) 
    {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(start);
        visited[start] = true;

        System.out.println("BFS traversal starting from vertex " + start + ":");
        bfsHelper(queue, visited);
        System.out.println();
    }

    private void bfsHelper(Queue<Integer> queue, boolean[] visited) {
        if (queue.isEmpty()) {
            return;
        }

        int current = queue.poll();
        System.out.print(current + " ");

        for (int neighbor : adjacencyList[current]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.add(neighbor);
            }
        }
        bfsHelper(queue, visited);
    }

    public static void main(String[] args) {
        
        
        Main graph = new Main(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.bfsRecursive(0);
    }
}
