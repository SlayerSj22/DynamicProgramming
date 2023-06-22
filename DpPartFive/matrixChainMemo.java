package DpPartFive;

import java.util.Arrays;

class matrixChainMemo{
     static int matrixMultiplication(int N, int arr[])
    {
        int dp[][]=new int[N][N];
        for(int a[]:dp)
        Arrays.fill(a,-1);
        int i=1;
        int j=N-1;
        return helper(arr,dp,i,j);
    }
    static int helper(int arr[],int dp[][],int i,int j){
        if(i==j)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int mini=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            int ans=helper(arr,dp,i,k)+helper(arr,dp,k+1,j)+arr[i-1]*arr[k]*arr[j];
            mini=Math.min(mini,ans);
        }
        return dp[i][j]=mini;
    }
}