package DpPartThree;

public class Target_Sum {
    static int findTargetSumWays(int[] arr, int N, int target) {
      
       int totalsum=0;
       for(int c:arr)
       totalsum+=c;
       
       if(totalsum-target<0)
       return 0;
        if((totalsum-target)%2==1) return 0;
        
       int sum=(totalsum-target)/2;
      
       int dp[][]=new int[N][sum+1];
       for(int i=0;i<N;i++)
       dp[i][0]=1;
       
       if(arr[0]<=sum){
           if(arr[0]==0&&sum==0)
           dp[0][0]=2;
           else dp[0][arr[0]]=1;
       }
       for(int i=1;i<N;i++){
           for(int j=0;j<=sum;j++){
               int notTaken=dp[i-1][j];
               int taken=0;
               if(j>=arr[i])
               taken=dp[i-1][j-arr[i]];
               
               dp[i][j]=taken+notTaken;
           }
       }
       return dp[N-1][sum];
       
    }
}
