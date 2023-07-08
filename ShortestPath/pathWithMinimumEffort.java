import java.util.Arrays;
import java.util.PriorityQueue;

public class pathWithMinimumEffort {
    
}
class Tuple{
    int distance;
    int row;
    int col;
    Tuple(int distance,int row,int col){
        this.distance=distance;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    
    int MinimumEffort(int heights[][]) {
        
        int n=heights.length;
        int m=heights[0].length;
        
        int dis[][]=new int[n][m];
        
        for(int a[]:dis)
        Arrays.fill(a,Integer.MAX_VALUE);
        
        dis[0][0]=0;
        
        int dr[] = {-1, 0, 1, 0}; 
        int dc[] = {0, 1, 0, -1}; 
        
        
        
        PriorityQueue<Tuple> pq = 
        new PriorityQueue<Tuple>((x,y) -> x.distance - y.distance);
        
        pq.add(new Tuple(0,0,0));
        while(!pq.isEmpty()){
            Tuple p=pq.poll();
            
            int diff=p.distance;
            int row=p.row;
            int col=p.col;
            
            if(row==n-1&&col==m-1)
            return diff;
            for(int i=0;i<4;i++){
                int nrow=row+dr[i];
                int ncol=col+dc[i];
                
                if(ncol<m&&ncol>=0&&nrow<n&&nrow>=0){
                    int maxEffort=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
                    if(dis[nrow][ncol]>maxEffort){
                        dis[nrow][ncol]=maxEffort;
                        pq.add(new Tuple(maxEffort,nrow,ncol));
                    }
                }
            }
            
        }
        return 0;
        
    }
}