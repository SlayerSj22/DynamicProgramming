import java.util.ArrayList;
import java.util.Arrays;

public class bellmanFord {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
         int dis[]=new int[V];
         Arrays.fill(dis,100000000);
         dis[S]=0;
         for(int i=0;i<V-1;i++){
             for(int j=0;j<edges.size();j++){
                 int u=edges.get(j).get(0);
                 int v=edges.get(j).get(1);
                 int wt=edges.get(j).get(2);
                 
                 if(dis[u]!=100000000&&dis[u]+wt<dis[v]){
                     dis[v]=dis[u]+wt;
                 }
             }
         }
         
         boolean flag=false;
         for(int i=0;i<edges.size();i++){
                 int u=edges.get(i).get(0);
                 int v=edges.get(i).get(1);
                 int wt=edges.get(i).get(2);
                 
                 if(dis[u]+wt<dis[v]){
                     flag =true;
                     break;
                 }
             }
             if(flag){
                 int a[]={-1};
                 return a;
             }
         return dis;
         
         
    }
}
