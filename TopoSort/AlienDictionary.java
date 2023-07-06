package TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {
    class Solution
{
    public List<Integer> topoSort(List<List<Integer>> adj,int V){
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int node:adj.get(i)){
                indegree[node]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            int u=q.poll();
            list.add(u);
            
            for(int node :adj.get(u)){
                indegree[node]--;
                if(indegree[node]==0) q.add(node);
            }
        }
        return list;
        
    }
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        List<List<Integer>> adj =new ArrayList<>();
        
        for(int i=0;i<K;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int len=Math.min(s1.length(),s2.length());
            for(int ptr=0;ptr<len;ptr++){
                if(s1.charAt(ptr) !=s2.charAt(ptr)){
                    adj.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
                    break;
                }
            }
        }
        List<Integer> topo=topoSort(adj,K);
        String ans="";
        
        for(int node : topo){
            ans+=(char)(node+'a');
        }
        return ans;
        
    }
}
}
