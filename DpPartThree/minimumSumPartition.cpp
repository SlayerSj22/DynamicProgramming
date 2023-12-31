#include<bits/stdc++.h>
using namespace std;
class Solution{

  public:
	int minDifference(int arr[], int n)  { 
	    int totSum = 0;

     for (int i = 0; i < n; i++) {
         totSum += arr[i];
    }

  vector < vector < int >> dp(n, vector < int > (totSum + 1, -1));

     for (int i = 0; i <= totSum; i++) {
        bool temp = helper(n - 1, i, arr, dp);
    }

     int mini = 1e9;
     for (int i = 0; i <= totSum; i++) {
       if (dp[n - 1][i] == true) {
      int diff = abs(i - (totSum - i));
      mini = min(mini, diff);
    }
  }
  return mini;
	} 
	
bool helper(int ind, int target, int arr[], vector < vector 
< int >> & dp) {
  if (target == 0)
    return dp[ind][target]=true;

  if (ind == 0)
    return dp[ind][target] = arr[0] == target;

  if (dp[ind][target] != -1)
    return dp[ind][target];

  bool notTaken = helper(ind - 1, target, arr, dp);

  bool taken = false;
  if (arr[ind] <= target)
    taken = helper(ind - 1, target - arr[ind], arr, dp);

  return dp[ind][target] = notTaken || taken;
}
};
int main(){
    return 0;
}