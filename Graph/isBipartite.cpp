#include<bits/stdc++.h>
using namespace std;
class Solution {
    public:
bool checkBip(int si,vector<int>adj[],int v,int color[]){
         queue<int>q;
         q.push(si);
         color[si]=1;
         while(!q.empty()){
             int node = q.front();
             q.pop();
             for(auto it:adj[node]){
                 if(color[it]==-1)
                 {
                     q.push(it);
                    color[it]=1-color[node];
                 }
                 else if(color[it]==color[node])
                 return false;
             }
         }
         return true;
     }
	bool isBipartite(int V, vector<int>adj[]){
	    // Code here
	   int color[V];
	   memset(color,-1,sizeof color);
	   for(int i=0;i<V;i++){
	       if(color[i]==-1){
	           if(!checkBip(i,adj,V,color))
	           return false;
	       }
	   }
	    return true;
	}

};
int main(){

}