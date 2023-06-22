package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        helper(ans,arr,N,0);
        Collections.sort(ans);
        return ans;
    }
    void helper(ArrayList<Integer> ans,ArrayList<Integer> arr,int n,int sum){
        
        if(n==0){
            ans.add(sum);
            return;
        }
        helper(ans,arr,n-1,sum+arr.get(n-1));
        helper(ans,arr,n-1,sum);
    }
}
