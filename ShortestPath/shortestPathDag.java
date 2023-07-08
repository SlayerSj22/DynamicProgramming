import java.util.ArrayList;
import java.util.Stack;

public class shortestPathDag {
    
}


//User function Template for Java
class Pair{
    int u;
    int wt;
    
    public Pair(int u, int wt){
        this.u = u;
        this.wt = wt;
    }
}


class Solution {
    
    public void DFS(int node, ArrayList<ArrayList<Pair>> adj, boolean[] vis, Stack<Integer> st){
        vis[node] = true;
        
        for(int i=0;i<adj.get(node).size();i++){
            int u = adj.get(node).get(i).u;
            if(!vis[u])
                DFS(u, adj, vis, st);
        }
        st.add(node);
    }

    public int[] shortestPath(int N,int M, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
        for(int i=0;i<N;i++){
            ArrayList<Pair> A = new ArrayList<Pair>();
            adj.add(A);
        }
        
        for(int i=0;i<M;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            
            adj.get(u).add(new Pair(v, wt));
        }
        
        //Toposort using DFS
        
        boolean[] vis = new boolean[N];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<N;i++){
            if(!vis[i])
                DFS(i, adj, vis, st);
        }
        
        int[] dist = new int[N];
        for(int i=0;i<N;i++){   
            dist[i] = (int)1e9;
        }
        dist[0] = 0; // as dist[0] = 0 (src(0))
        //System.out.println(st);
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();
            
            for(int i=0;i<adj.get(node).size();i++){
                int u = adj.get(node).get(i).u;
                int wt = adj.get(node).get(i).wt;
                
                if(dist[node]+wt<dist[u])
                    dist[u] = dist[node]+wt;
            }
        }
        for(int i=0;i<N;i++){
            if(dist[i]==(int)1e9)
                dist[i] = -1;
        }
        return dist;
    }
}
