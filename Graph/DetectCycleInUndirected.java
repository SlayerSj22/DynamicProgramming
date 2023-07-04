package Graph;

import java.util.ArrayList;

public class DetectCycleInUndirected {
     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
              if(helper(adj,visited,i,-1))
              return true;
        }
        return false;
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>> adj,boolean visited[],int src,int parent){
        visited[src]=true;
        for(int c:adj.get(src)){
            if(visited[c]==false){
                if(helper(adj,visited,c,src)==true)
                return true;
            }
            else if(c!=parent)
            return true;
        }
        return false;
    }
}
