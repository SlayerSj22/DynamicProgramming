#include <bits/stdc++.h>
using namespace std;
vector<int> longestIncreasingSubsequence(int n, vector<int>& arr) {
        int dp[n];
        dp[0] = 1;
        int hash[n];
        hash[0] = 0;
        int maxi = 1,last_ind = 0;
        for(int i = 1;i < n;i++){
            hash[i] = i;
            dp[i] = 1;
            for(int j = 0;j < i;j++){
                if(arr[j] < arr[i] && 1+dp[j] > dp[i]){
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }   
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                last_ind = i;
            }
        }
        
        vector <int> ans;
        ans.push_back(arr[last_ind]);
        while(hash[last_ind]!=last_ind){
            last_ind = hash[last_ind];
            ans.push_back(arr[last_ind]);
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
int main(){
    // use above function from here
}