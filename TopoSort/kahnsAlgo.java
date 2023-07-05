package TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahnsAlgo {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int c:adj.get(i)){
                indegree[c]++;
            }
        }
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<V;i++)
        if(indegree[i]==0)
        q.add(i);
        
        while(!q.isEmpty()){
            int u=q.poll();
            a.add(u);
            for(int c:adj.get(u)){
                indegree[c]--;
                if(indegree[c]==0)
                q.add(c);
            }
        }
        int ans[]=new int[V];
        for(int i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
}
