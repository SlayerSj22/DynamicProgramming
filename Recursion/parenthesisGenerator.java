package Recursion;

import java.util.ArrayList;
import java.util.List;

public class parenthesisGenerator {
     public List<String> AllParenthesis(int n) 
    {
        List<String> ans=new ArrayList<String>();
        
        fnc(ans,0,0,n,"");
        return ans;
    }
    void fnc(List<String> ans,int open,int close,int n,String ds){
        if(ds.length()==n*2){
            ans.add(ds);
            return;
        }
        if(open<n){
            fnc(ans,open+1,close,n,ds+'(');
        }
        if(close<open){
            fnc(ans,open,close+1,n,ds+')');
        }
    }
}
