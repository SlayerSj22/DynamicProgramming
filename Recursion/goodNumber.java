package Recursion;

import java.util.ArrayList;

public class goodNumber {
    boolean isGoodNumber(int n,int D,int sum){
        if(n==0)
        return true;
        int digit=n%10;
        if(digit==D)
        return false;
        if(sum==-1)
        {
            return isGoodNumber(n/10,D,digit);
        }
        if(digit>sum){
            return isGoodNumber(n/10,D,sum+digit);
        }
        return false;
    }
    ArrayList<Integer> goodNumbers(int L, int R, int D) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=L;i<=R;i++){
            if(isGoodNumber(i,D,-1))
            ans.add(i);
        }
        return ans;
    }
}
