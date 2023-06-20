package DpPartThree;

public class knapSackUnBounded {
    
    static int knapSack(int N, int W, int val[], int wt[])
    {
          int dp[]=new int[W+1];
          
          for(int i=wt[0];i<=W;i++){
              
              
                  dp[i]=((int)i/wt[0])*val[0];
          }
          for(int i=1;i<N;i++){
              int temp[]=new int[W+1];
              for(int j=0;j<=W;j++){
                  int notTaken=dp[j];
                  int taken=Integer.MIN_VALUE;
                  if(wt[i]<=j)
                  taken=temp[j-wt[i]]+val[i];
                  
                  temp[j]=Math.max(taken,notTaken);
              }
              dp=temp;
          }
          return dp[W];
    
}

}
