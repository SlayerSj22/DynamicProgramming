package DpPartFive;

public class rodCutting {
    public int cutRod(int price[], int n) {
        int dp[]=new int[n+1];
        
        for(int i=1;i<=n;i++)
        dp[i]=price[i-1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[j]+dp[i-j]);
            }
        }
        return dp[n];
    
}
}
