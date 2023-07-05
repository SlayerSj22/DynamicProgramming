package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    Pair(int _row,int _col){
        this.row=_row;
        this.col=_col;
    }
}

class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]&&grid[i][j]=='1')
                {
                    fnc(grid,i,j,visited,n,m);
                    count++;
                }
            }
        }
        
        return count;
    }
    void fnc(char grid[][],int i,int j,boolean visited[][],int n,int m){
        
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(i,j));
       visited[i][j]=true;
       while(!q.isEmpty()){
           int row=q.peek().row;
           int col=q.peek().col;
           q.poll();
       for(int delRow=-1;delRow<=1;delRow++){
           for(int delCol=-1;delCol<=1;delCol++){
               int nrow=row+delRow;
               int ncol=col+delCol;
               if(nrow<n&&nrow>=0&&ncol<m&&ncol>=0&&!visited[nrow][ncol]&&grid[nrow][ncol]=='1')
               {
                   q.add(new Pair(nrow,ncol));
                   visited[nrow][ncol]=true;
               }
           }
       }
       }
       
    }
}
public class noOfIslands {
    
}
