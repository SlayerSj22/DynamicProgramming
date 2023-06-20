package DpPartThree;

import java.util.Arrays;

public class minimumNoOfcoins {
    static int helper(int[] arr, int ind, int N, int[][] dp){

    if(ind == 0){
        if(N%arr[0] == 0) return N/arr[0];
        else return (int)Math.pow(10,9);
    }
    
    if(dp[ind][N]!=-1)
        return dp[ind][N];
        
    int notTaken = 0 + helper(arr,ind-1,N,dp);
    
    int taken = (int)Math.pow(10,9);
    if(arr[ind] <= N)
        taken = 1 + helper(arr,ind,N-arr[ind],dp);
        
    return dp[ind][N] = Math.min(notTaken,taken);
}


static int minimumElements(int N){
    
     int a[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
    
    int[][] dp=new int[10][N+1];
    
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    int ans =  helper(a, 9, N, dp);
    if(ans >= (int)Math.pow(10,9)) return -1;
    return ans;
}
}
