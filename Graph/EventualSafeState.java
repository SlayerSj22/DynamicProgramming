package Graph;

import java.util.ArrayList;
import java.util.List;

public class EventualSafeState {
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        
        boolean visited[]=new boolean[V];
        boolean path[]=new boolean[V];
        int check[]=new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false)
            Dfs(i,adj,visited,path,check);
        }
         List<Integer> ans =new  ArrayList<Integer>();
         for(int i=0;i<V;i++)
         if(check[i]==1)ans.add(i);
         return ans;

        }
        
    boolean Dfs(int i,List<List<Integer>> adj,boolean visited[],boolean path[],int check[]){
        visited[i]=true;
        path[i]=true;check[i]=0;
        
        for(int c:adj.get(i)){
            if(visited[c]==false)
            {
                if(Dfs(c,adj,visited,path,check))
                return true;
                
            }
            else if(path[c]==true)
            return true;
        }
        check[i]=1;
        path[i]=false;
        return false;
    }      
}
