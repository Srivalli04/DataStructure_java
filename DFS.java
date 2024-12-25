import java.util.*;

public class Main 
 {
    private int V; 
    private LinkedList<Integer>[] adjacencyList; 

  
    public Main(int V) 
    {
        this.V = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) 
        {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int s, int d) 
    {
        adjacencyList[s].add(d); 
    }

    public void dfs(int start) 
    {
        boolean[] visited = new boolean[V]; 
        System.out.println("DFS traversal starting from vertex " + start + ":");
        dfsHelper(start, visited);
        System.out.println();
    }

    
    private void dfsHelper(int current, boolean[] visited) 
    {
        visited[current] = true; 
        System.out.print(current + " "); 

        for (int neighbor : adjacencyList[current]) 
        {
            if (!visited[neighbor]) 
            {
                dfsHelper(neighbor, visited); 
            }
        }
    }

    public static void main(String[] args) 
    {

        Main graph = new Main(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.dfs(0);
    }
}
