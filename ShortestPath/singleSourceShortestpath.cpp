#include<bits/stdc++.h>
using namespace std;

class Solution {
  public:
    vector<int> shortestPath(vector<vector<int>>& edges, int N,int M, int src){
        vector<int> adj[N];
        for(auto it : edges){
            int  u = it[0];
            int v = it[1];
            
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        int dis[N];
        for(int i=0;i<N;i++){
            dis[i] = INT_MAX;
        }
        // src node
        dis[src]= 0;
        
        queue<int> q;
        q.push(src);
        while(!q.empty()){
            int node = q.front();
            q.pop();
            for(auto it : adj[node]){
                if(dis[node]+1<dis[it]){
                    dis[it]= dis[node]+1;
                    q.push(it);
                }
            }
        }
        vector<int> ans(N,-1);
        
        for(int i=0;i<N;i++){
           if(dis[i]!= INT_MAX){
              ans[i]=dis[i];
           } 
        }
        return ans;
    }
};

int main(){

}