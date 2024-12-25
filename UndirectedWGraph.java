import java.util.*;
public class UndirectedUnGraph
{
    static class Edge
    {
        int s;
        int d;
        int w;
        Edge(int s,int d,int w)
        {
            this.s=s;
            this.d=s;
            this.w=w;
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
    public void addEdge(int s,int d,int w){
        Edge edge=new Edge(s,d,w);
        graph[s].add(edge);
        Edge rEdge=new Edge(d,s,w);
        graph[d].add(rEdge);
    }
    public void print(ArrayList[] graph)
    {
         for(int i=0;i<V;i++)
         {
             ArrayList<Edge> currentList=graph[i];
             System.out.print("for"+i+" ");
             for(Edge e:currentList){
                 System.out.print("->"+e.d+" w= "+e.w+" ,");
             }
             System.out.println();
         }
    }
    public static void main(String[] args)
    {
       UndirectedUnGraph g1=new UndirectedUnGraph(4);
        g1.addEdge(0,1,10);
         g1.addEdge(0,3,20);
          g1.addEdge(1,2,30);
           g1.addEdge(2,3,40);
           g1.print(g1.graph);
          
    }
}