package DpPartTwo;

import java.util.Arrays;


public class minPath {
    public int minPathSum(int[][] grid) {
        int N=grid.length;
        int M=grid[0].length;
         int dp[][]=new int[N][M];
       for(int row[]: dp)
        Arrays.fill(row,-1);
        int i=N-1;
        int j=M-1;
        return helper(i,j,grid,dp);
    }
    int helper(int i,int j,int grid[][],int dp[][]){
        if(i==0&&j==0)
        return grid[0][0];
        if(i<0||j<0)
        return 1000000007;
         if(dp[i][j]!=-1) return dp[i][j];
        int up=grid[i][j]+helper(i-1,j,grid,dp);
        int left=grid[i][j]+helper(i,j-1,grid,dp);
        return dp[i][j]=  Math.min(up,left);
    }
}
