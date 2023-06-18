package DpPartTwo;

public class MaximumPathSum {
    static int maximumPath(int N, int Matrix[][])
    {
        int dp[][]=new int[N][N];
        if(N==1)
        {
            int res=0;
            for(int i=0;i<N;i++)
            res=Math.max(res,Matrix[0][i]);
            return res;
        }
        for(int i=0;i<N;i++)
        dp[0][i]=Matrix[0][i];
        for(int i=1;i<N;i++){
            for(int j=0;j<N;j++)
            if(j==0)
            dp[i][j]=Matrix[i][j]+Math.max(dp[i-1][j],dp[i-1][j+1]);
            
            else if(j==N-1) dp[i][j]=Matrix[i][j]+Math.max(dp[i-1][j],dp[i-1][j-1]);
            
            else dp[i][j]=Matrix[i][j]+Math.max(dp[i-1][j],Math.max(dp[i-1][j+1],dp[i-1][j-1]));


        }
        int res=0;
        for(int i=0;i<N;i++)
        res=Math.max(res,dp[N-1][i]);
        return res;
        
    }
}
