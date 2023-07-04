package Graph;

import java.util.ArrayList;

public class NoOfProvince {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean vis[]=new boolean[V];
        int ans=0;
        
        for(int i=0;i<V;i++)
        {if(vis[i]==false){
            ans++;
            dfs(adj,i,V,vis);
        }
            
        }
       
      return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int i,int V,boolean vis[]){
        vis[i]=true;
        for(int j=0;j<V;j++){
            if(adj.get(i).get(j)==1&&vis[j]==false)
            dfs(adj,j,V,vis);
        }
    }
}
