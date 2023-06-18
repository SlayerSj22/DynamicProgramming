import java.util.Arrays;

public class frogJump {
    public int minimumEnergy(int height[],int n){
       int dp[]=new int[n];
        Arrays.fill(dp,-1);
       return helper(dp,n-1,height);
    }
    public int helper(int dp[],int index,int height[]){
        if(index==0)
        return  0;
        if(dp[index]==-1){
            int twoStep=Integer.MAX_VALUE;
            int oneStep=helper(dp,index-1,height)+Math.abs(height[index]-height[index-1]);
            if(index>1)
            twoStep=helper(dp,index-2,height)+Math.abs(height[index]-height[index-2]);
            dp[index]=Math.min(oneStep,twoStep);
        }
        return dp[index];
    }
}
