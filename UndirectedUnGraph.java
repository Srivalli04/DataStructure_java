import java.util.*;
public class UndirectedUnGraph
{
    static class Edge
    {
        int s;
        int d;
        Edge(int s,int d)
        {
            this.s=s;
            this.d=s;
        }
    }
    int V;
    ArrayList<Edge> graph[];
    Main(int V){
        this.V=V;
        this.graph=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]= new ArrayList<Edge>();
            
        }
    }
    public void addEdge(int s,int d){
        Edge edge=new Edge(s,d);
        graph[s].add(edge);
        Edge rEdge=new Edge(d,s);
        graph[d].add(rEdge);
    }
    public void print(ArrayList[] graph)
    {
         for(int i=0;i<V;i++)
         {
             ArrayList<Edge> currentList=graph[i];
             System.out.print("for"+i+" ");
             for(Edge e:currentList){
                 System.out.print("->"+e.d);
             }
             System.out.println();
         }
    }
    public static void main(String[] args){
     UndirectedUnGraph g1=new UndirectedUnGraph(4);
        g1.addEdge(0,1);
         g1.addEdge(0,3);
          g1.addEdge(1,2);
           g1.addEdge(2,3);
           g1.print(g1.graph);
          
    }
}