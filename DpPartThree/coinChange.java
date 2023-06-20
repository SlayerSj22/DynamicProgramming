package DpPartThree;

public class coinChange {
    public long count(int arr[], int n, int sum) {
        
    long dp[][]=new long[n][sum+1];
    
    
    //Initializing base condition
    for(int i=0;i<=sum;i++){
        if(i%arr[0]==0)
            dp[0][i]=1;

    }
    
    for(int i=1; i<n;i++){
        for(int target=0;target<=sum;target++){
            long notTaken = dp[i-1][target];
            
            long taken = 0;
            if(arr[i]<=target)
                taken = dp[i][target-arr[i]];
                
            dp[i][target] = notTaken + taken;
        }
    }
    
    return dp[n-1][sum];
	  
    }
}
