import java.util.ArrayList;
import java.util.Arrays;


class dijkstra{
    static int[] Dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
	    {
			int dist[]=new int[V];
			Arrays.fill(dist, Integer.MAX_VALUE);
			boolean fin[]=new boolean[V];
			dist[S]=0;
			for(int count=0;count<V;count++) {
				int u=-1;
				for(int i=0;i<V;i++) {
					if(!fin[i]&&(u==-1||dist[i]<dist[u]))
						u=i;
				}
				fin[u]=true;
				for(ArrayList<Integer> c:adj.get(u)) {
					if(!fin[c.get(0)]&&c.get(1)!=0)
						dist[c.get(0)]=Math.min(dist[c.get(0)],dist[u]+c.get(1));
				}
			}
			return dist;
			
	        
	    }
}