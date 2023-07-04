package Graph;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int row,col,dis;
    pair(int r,int c,int d)
    {
        row=r;
        col=c;
        dis=d;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
   
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }
            }
        }
        
        int time = 0;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        
        while(!q.isEmpty())
        {
            pair p=q.poll();
             int r=p.row;
             int c=p.col;
             int t=p.dis;
             
         time=Math.max(t,time);
         for(int i = 0; i<4; i++){
                int nrow = r+delrow[i];
                int ncol = c+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]== 0 && grid[nrow][ncol] == 1){
                    q.add(new pair(nrow,ncol,t+1));
                    vis[nrow][ncol] = 2;
                }
            }
        }
        for(int g=0;g<n;g++)
        {
            for(int h=0;h<m;h++)
            {
                if(vis[g][h]==0 && grid[g][h]==1)
                return -1;
            }
        }
        
        return time;
    }
}
public class rottenTomato {
    
}
