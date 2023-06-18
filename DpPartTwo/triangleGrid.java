package DpPartTwo;

import java.util.Arrays;
import java.util.List;

public class triangleGrid {
      
     public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int i=0,j=0;
        int dp[][]=new int[n][n];
        for(int a[]:dp)
        Arrays.fill(a,-1);

        return helper(i,j,triangle,dp);
       
    }

    int helper(int i,int j,List<List<Integer>> triangle,int dp[][]){

        
      if(dp[i][j]!=-1)
       return dp[i][j];

        if(i==triangle.size()-1)
        return  triangle.get(i).get(j);
        int down=triangle.get(i).get(j)+helper(i+1,j,triangle,dp);
        int diagonal=triangle.get(i).get(j)+helper(i+1,j+1,triangle,dp);
        return dp[i][j]=Math.min(down,diagonal);
    }
}
