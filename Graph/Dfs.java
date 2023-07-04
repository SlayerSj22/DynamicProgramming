package Graph;

import java.util.ArrayList;

public class Dfs {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
         ArrayList<Integer> ans= new  ArrayList<Integer>();
        helper(adj,visited,0,ans);
        return ans;
    }
    
    void helper( ArrayList<ArrayList<Integer>> adj,boolean visited[],int i,ArrayList<Integer> ans){
              visited[i]=true;
              ans.add(i);
              
              for(int c:adj.get(i))
              if(!visited[c])
              helper(adj,visited,c,ans);
          
         
    }
}
