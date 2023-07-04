package Graph;

import java.util.ArrayList;

public class printList {
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         for(int i=0;i<adj.size();i++){
             ArrayList<Integer> temp=new ArrayList<Integer>();
             temp.add(i);
             for(int j=0;j<adj.get(i).size();j++)
             {
                 temp.add(adj.get(i).get(j));
             }
             ans.add(temp);
         }
         return ans;
    }
}
