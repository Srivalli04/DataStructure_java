import java.util.*;

public class DirectedGraph 
{
    int[][] adjacencyMatrix; 
    int V; 

    DirectedGraph(int V) 
    {
        this.V = V;
        this.adjacencyMatrix = new int[V][V]; 
    }

    public void addEdge(int s, int d) 
    {
        adjacencyMatrix[s][d] = 1; 
    }

    public void print() 
    {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) 
            {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
      
        DirectedGraph g1 = new DirectedGraph(4);

       
        g1.addEdge(0, 1);
        g1.addEdge(0, 3);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);

       
        g1.print();
    }
}
