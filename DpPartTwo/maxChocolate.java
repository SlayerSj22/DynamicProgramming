package DpPartTwo;
class Solution{
    public int solve(int n, int m, int grid[][]){
        int dp[][][]=new int[n][m][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        for(int k=0;k<m;k++)
        dp[i][j][k]=-1;
        
        return  helper(0,0,m-1,grid,dp,n,m);
    }
    
    int helper(int i,int j1,int j2,int grid[][],int dp[][][],int n,int m){
         if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
          return (int)(Math.pow(-10, 9));

        if (i == n - 1) {
         if (j1 == j2)
        return grid[i][j1];
        else
        return grid[i][j1] + grid[i][j2];
      }

      if (dp[i][j1][j2] != -1)
      return dp[i][j1][j2];

       int max = Integer.MIN_VALUE;
       for (int p1 = -1; p1 <= 1; p1++) {
       for (int p2 = -1; p2 <= 1; p2++) {
        int ans;
        if (j1 == j2)
          ans = grid[i][j1] + helper(i + 1, j1 +p1, j2 + p2, grid, dp, n, m);
         else
          ans = grid[i][j1] + grid[i][j2] + helper(i + 1, j1 + p1, j2 + p2,grid, dp, n, m);
        max = Math.max(max, ans);
      }
    }
    return dp[i][j1][j2] = max;
    }
}
public class maxChocolate {
    
}
