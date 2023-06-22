package DpPartFive;

import java.util.ArrayList;
import java.util.Arrays;

public class burstballon {
     int maxCoins(int N, ArrayList<Integer> arr) {
       // N = arr.size();
			arr.add(1);
        arr.add(0, 1);
       
        int [][] dp = new int[N+2][N+2];
        for(int i = 0; i <= N+1; i++) {
        	Arrays.fill(dp[i], -1);
        }
        return helper(1,N,dp,arr);
       
	
	}
	int helper(int i,int j,int dp[][],ArrayList<Integer> arr){
	    if(i>j)
	    return 0;
	    if(dp[i][j]!=-1)
	    return dp[i][j];
	    int maxi=Integer.MIN_VALUE;
	    for(int k=i;k<=j;k++){
	        int cost=arr.get(i-1)*arr.get(j+1)*arr.get(k)+helper(i,k-1,dp,arr)+helper(k+1,j,dp,arr);
	        maxi=Math.max(cost,maxi);
	    }
	    return dp[i][j]=maxi;
	}
}
