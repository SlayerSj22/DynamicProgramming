package DpPartThree;

public class RodCutting {
    public int cutRod(int price[], int n) {
       int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<n+1;i++){
            dp[i]=price[i-1];
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[j]+dp[i-j]);
            }
        }
        return dp[n];
    }
}
