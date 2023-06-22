package StockDp;

public class stockCoolDown {
     public long maximumProfit(long prices[], int N){
        long dp[][]=new long[N+2][2];
        
        for(int i=N-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                long profit=0;
                if(buy==0){
                    profit=Math.max(dp[i+1][0],-prices[i]+dp[i+1][1]);
                }
                else{
                    profit=Math.max(dp[i+1][1],prices[i]+dp[i+2][0]);
                }
                dp[i][buy]=profit;
            }
        }
        return dp[0][0];
    }
}
