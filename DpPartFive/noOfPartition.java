package DpPartFive;

import java.util.Arrays;

public class noOfPartition {
    static boolean isPalindrome(int i, int j, String s) {
    while (i < j) {
        if (s.charAt(i) != s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
    }
    
    static int helper(String str,int dp[],int i,int n){
        if(i==n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int  MIN_cost=Integer.MAX_VALUE;
        for(int k=i;k<n;k++){
            if(isPalindrome(i,k,str)){
            int cost=1+helper(str,dp,k+1,n);
            MIN_cost=Math.min(cost,MIN_cost);
            }
        }
        return dp[i]=MIN_cost;
    }
    static int palindromicPartition(String str)
    {
        int dp[]=new int[str.length()];
        Arrays.fill(dp,-1);
        int n=str.length();
        return helper(str,dp,0,n)-1;
    }
}
