package DpPartTwo;
import java.util.*;
class Solution{
    public int maximumPoints(int points[][],int N){
       int dp[][]=new int[N][4];
       for(int a[]:dp)
       Arrays.fill(a,-1);
       return helper(N-1,3,points,dp);
    }
    
   int helper(int day, int last, int[][] points, int[][] dp) {

        if (dp[day][last] != -1) return dp[day][last];

        if (day == 0) {
            int ans = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    ans = Math.max(ans, points[0][i]);
            }
            return dp[day][last] = ans;
        }

        int ans = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + helper(day - 1, i, points, dp);
                ans = Math.max(ans, activity);
            }

        }

        return dp[day][last] = ans;
    }

}