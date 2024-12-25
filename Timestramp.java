import java.util.*;
class Main{
    Queue <Integer> queue= new LinkedList<>();
    public void hits(int timestramp)
    {
        queue.add(timestramp);
    }
    public int gethits(int timestramp,int k)
    {
        int x=timestramp-k*60;
        while(!queue.isEmpty() && queue.peek()<=x)
        {
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args)
    {
        Main m1=new Main();
        m1.hits(60);
        m1.hits(122);
        m1.hits(360);
        m1.hits(410);
        m1.hits(570);
        m1.hits(623);
        m1.hits(789);
       System.out.print(m1.gethits(300,1));
    }
}
