package DpPartFive;

public class matrixChainTabular {
    static int matrixMultiplication(int N, int arr[])
    {
        int dp[][]=new int[N][N];
        for(int i=1;i<N;i++)
        dp[i][i]=0;
        for(int i=N-1;i>=1;i--){
            for(int j=i+1;j<N;j++){
                int mini=Integer.MAX_VALUE;
              for(int k=i;k<j;k++){
              int ans=dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
              mini=Math.min(ans, mini);
            
             }  
             dp[i][j]=mini;
            }
        }
        return dp[1][N-1];
    }
    
}
