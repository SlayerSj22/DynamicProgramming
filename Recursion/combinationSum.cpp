#include<iostream>
#include<bits/stdc++.h>
using namespace std;
 vector<vector<int> > combinationSum(vector<int> &A, int B) {
        vector<vector<int> > ans;
        vector<int> ds;
        sort(A.begin(),A.end());
         set<int> s( A.begin(), A.end() );
     A.assign( s.begin(), s.end() );
        fnc(ans,A,B,ds,0);
        return ans;
    }
    void fnc( vector<vector<int> > &ans,vector<int> &A,int sum,vector<int> &ds,int i){
        if(i==A.size()){
            if(sum==0)
            ans.push_back(ds);
            return;
        }
        if(sum-A[i]>=0){
            ds.push_back(A[i]);
            fnc(ans,A,sum-A[i],ds,i);
            ds.pop_back();
        }
        fnc(ans,A,sum,ds,i+1);
    }
int main(){

}