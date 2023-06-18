import java.util.Arrays;

public class introductionTodp {
    static long mod = 1000000007;
    static long topDown(int n) {
        long memo[]=new long[n+1];
        Arrays.fill(memo,-1);
        return TopDownHelper(n,memo);
    }
    static long TopDownHelper(int n,long memo[]){
        if(memo[n]==-1){
            long res;
            if(n==0||n==1)
            res=n;
            else
            res=(TopDownHelper(n-1,memo)+TopDownHelper(n-2,memo))%mod;
            memo[n]=res;
        }
        return memo[n];
    }

    static long bottomUp(int n) {
        long mod=1000000007;
        long dp[]=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        dp[i]=(dp[i-1]+dp[i-2])%mod;
        return dp[n];
        
    }
}
