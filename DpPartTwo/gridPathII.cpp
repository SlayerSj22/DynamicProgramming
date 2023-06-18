class Solution {
  public:
    int mod = int(1e9 + 7);
  
    int helper(int i, int j, vector<vector<int>>& grid, vector<vector<int>>& dp){
        if(i >= 0 && j >= 0 && grid[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int up = helper(i-1, j, grid, dp);
        int left = helper(i, j-1, grid, dp);
        
        return dp[i][j] = (left + up) % mod;
    }
  
    int totalWays(int n, int m, vector<vector<int>>& grid) {
        vector<vector<int>> dp(n, vector<int> (m, -1));
        return helper(n-1, m-1, grid, dp);
    }
};