package DpPartThree;
class isSubSet{   

    boolean isSubsetSum(int arr[], int sum){
        int n = arr.length;
        boolean t[][]=new boolean[n+1][sum+1];
        
        //initialisation
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(i == 0) t[i][j] = false;
                if(j == 0) t[i][j] = true;
            }
        }
        
        //recursion to iterative
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][(j - arr[i-1])] || t[i-1][j];
                }
                else t[i][j] = t[i-1][j];
            }
        }
        
        //return last value
        return t[n][sum];
        
    }
};
// above solution is for Gfg isSubSet problem