package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>  ans= new ArrayList<Integer> ();
        boolean visited[]=new boolean[V];
        
                helper( adj,visited,0,ans);
            
        
        return ans;
        
	}
        
        void helper(ArrayList<ArrayList<Integer>> adj,boolean visited[],int i,ArrayList<Integer> ans){
            Queue<Integer> q=new LinkedList<Integer>();
            q.add(i);
            visited[i]=true;
            while(!q.isEmpty()) {
            	int curr=q.poll();
            	ans.add(curr);
            	for(int c:adj.get(curr)) {
            		if(!visited[c]) {
            			q.add(c);
            			visited[c]=true;
            		}
            	}
            }
        }
}
