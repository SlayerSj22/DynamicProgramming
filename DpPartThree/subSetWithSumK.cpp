#include <bits/stdc++.h>
using namespace std;
int mod=1e9+7;
int perfectSum(int arr[], int n, int sum)
	{   
        vector<vector<int>> dp(n, vector<int> (sum+1, 0));
        
        //Base Cases
        for (int i=0; i<n; ++i)
            dp[i][0] = 1;
        if (arr[0] <= sum)
        {
            if(arr[0]==0) 
                dp[0][arr[0]] = 2;
            else 
                dp[0][arr[0]] = 1;
        }
        
        //For loops for states :- n and sum
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<=sum; j++){
                int not_pick=dp[i-1][j]%mod;
                int pick=0;
                if(arr[i]<=j)
                    pick=dp[i-1][j-arr[i]]%mod;
                dp[i][j]=not_pick+pick;
            }
        }
        return dp[n-1][sum]%mod;
	}
int main(){
    
    return 0;
}

