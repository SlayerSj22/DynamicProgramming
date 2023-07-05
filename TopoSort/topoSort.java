package TopoSort;

import java.util.ArrayList;
import java.util.Stack;

public class topoSort{
    static int[] toposort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> stack= new Stack<Integer>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
           if(!visited[i])
            DfsRec(stack,visited,adj,i);
        }
        int ans[]=new int[V];
       for(int i=0;i<V;i++)
       ans[i]=stack.pop();
        return ans;
    }
     
     static void DfsRec(Stack<Integer> stack,boolean visited[],ArrayList<ArrayList<Integer>> adj,int src){
         visited[src]=true;
         for(int c:adj.get(src))
         if(!visited[c])
         DfsRec(stack,visited,adj,c);
         
         stack.push(src);
         
     }
}