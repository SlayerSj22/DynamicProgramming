package TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class courseSchedule {
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
       int indegree[]=new int[n];
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
        }
       
       
       for (int i = 0; i < n; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        
       for(int i=0;i<n;i++)
       if(indegree[i]==0)
       q.add(i);
       
       int a[]=new int[n];
       int j=0;
       
       while(!q.isEmpty()){
           int temp=q.poll();
           a[j++]=temp;
           
           for(int i:adj.get(temp))
          { indegree[i]--;
          
             if(indegree[i]==0)q.add(i);
          }
           
            
       
       }
       if(j==n)
       return a;
       int arr[]={};
       return arr;
      
        
    }
}
