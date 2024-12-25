import java.util.*;

public class CyclicOrNot
{
    static class Graph
    {
        int vertex;
        List<List<Integer>> adjacentList;

        Graph(int vertex)
        {
            this.vertex=vertex;
            adjacentList new ArrayList<>();
            for(int i=0;i<vertex;i++)
            {
                adjacentList.add(ArrayList<>());
            }
        }
    }
    void addEdge(int s,int d)
    {
        adjacentList.get(s).add(d);
        adjacentList.get(d).add(s);
    }
    boolean hasCycle()
    {
        boolean[] visited=new boolean[vertex];
        for(int i=0;i<vertex;i++)
        {
            if(!visited[i] && detectCycleDFS(I,-1,visited))
            {
                return true;
            }
        }
        return false;
    }
    private boolean detectCycleDFS(int node,int parent,boolean[] visited)
    {
        for(int neighbor: adjacentList(node))
        {
            if(!visited[neighbour])
            {
                if(detectCycleDFS(neighbour,node,))
            }
        }
        public class Main{

    static class Graph {
        private final int vertices;
        private final List<List<Integer>> adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination) {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); 
        }

        public boolean isCyclic() {
            boolean[] visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    if (isCyclicUtil(i, visited, -1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isCyclicUtil(int node, boolean[] visited, int parent) {
            visited[node] = true;

            for (Integer neighbor : adjacencyList.get(node)) {
                if (!visited[neighbor]) {
                    if (isCyclicUtil(neighbor, visited, node)) {
                        return true;
                    }
                } else if (neighbor != parent) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices in the graph:");
        int vertices = scanner.nextInt();

        Graph graph = new Graph(vertices);

        System.out.println("Enter the number of edges in the graph:");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        if (graph.isCyclic()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }

        scanner.close();
    }
}  
    }
}
