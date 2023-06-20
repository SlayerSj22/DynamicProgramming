package DpPartThree;

public class partitionWithDiff {
     public int countPartitions(int n, int d, int arr[]){
        int totalsum=0;
        for(int c:arr)
        totalsum+=c;
        if(totalsum-d<0)
        return 0;
        if((totalsum-d)%2==1)
        return 0;
        int sum = (totalsum-d)/2;
        
        int dp[][]=new int[n][sum+1];
        for(int i=0;i<n;i++)
        dp[i][0]=1;
        
            if(arr[0]<=sum){
                if(arr[0]==0)
                dp[0][0]=2;
                else dp[0][arr[0]]=1;
            }
            
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=sum;j++){
                int notTaken=dp[i-1][j];
                int taken=0;
                if(j>=arr[i])
                taken=dp[i-1][j-arr[i]];
                dp[i][j]=(taken+notTaken)%1000000007;
            }
        }
        return dp[n-1][sum];
        
    }
}
