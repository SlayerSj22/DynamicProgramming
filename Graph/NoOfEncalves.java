package Graph;

public class NoOfEncalves {
     int numberOfEnclaves(int[][] a) {
        int n=a.length;
        int m=a[0].length;

        boolean visited[][]= new boolean[n][m];
        int delRow[]={1,0,-1,0};
        int delCol[]={0,1,0,-1};
        
        for(int i=0;i<m;i++){
            if(a[0][i]==1&&!visited[0][i])
            dfs(0,i,a,delRow,delCol,visited,n,m);
            
             if(a[n-1][i]==1&&!visited[n-1][i])
            dfs(n-1,i,a,delRow,delCol,visited,n,m);
        }
        
        for(int i=0;i<n;i++){
            if(a[i][0]==1&&!visited[i][0])
            dfs(i,0,a,delRow,delCol,visited,n,m);
            
             if(a[i][m-1]==1&&!visited[i][m-1])
            dfs(i,m-1,a,delRow,delCol,visited,n,m);
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        if(!visited[i][j]&&a[i][j]==1)
        ans++;
        
        return ans;
    }
    
    
    void dfs(int row,int col,int a[][],int delRow[],int delCol[],boolean visited[][],int n,int m){
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int ncol=col+delCol[i];
            int nrow=row+delRow[i];
            if(ncol>=0&&ncol<m&&nrow>=0&&nrow<n&&!visited[nrow][ncol]&&a[nrow][ncol]==1)
            dfs(nrow,ncol,a,delRow,delCol,visited,n,m);
        }
}
}
