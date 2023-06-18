

class Solution{
   
    int minimizeCost(int height[], int n, int k) {
       int  dp[]=new int[n];
       dp[0]=0;
       for(int i=1;i<n;i++)
       {
           int minsteps=Integer.MAX_VALUE;
           for(int j=1;j<=k;j++)
           {
               if(i-j>=0)
               {
                   int cur=Math.abs(height[i]-height[i-j])+dp[i-j];
                   
                   minsteps=Math.min(minsteps,cur);
                  
               }
           }
           dp[i]=minsteps;
       }
       return dp[n-1];
    }
}
