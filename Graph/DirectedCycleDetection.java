package Graph;

import java.util.ArrayList;

public class DirectedCycleDetection {
     public boolean Rec( ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean rec[],int src){
        visited[src]=true;
        rec[src]=true;
        for(int u:adj.get(src)){
            if(!visited[u]&&Rec(adj,visited,rec,u))
            return true;
            else if(rec[u])
            return true;
        }
        rec[src]=false;
        return false;
    }
    
    
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[v];
        boolean rec[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i])
            if(Rec(adj,visited,rec,i))
            return true;
        }
        return false;
    }
}
