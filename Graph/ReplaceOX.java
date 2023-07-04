package Graph;

public class ReplaceOX {
    static char[][] fill(int n, int m, char a[][])
    {
        char ans[][]=new char[n][m];
        boolean visited[][]= new boolean[n][m];
        int delRow[]={1,0,-1,0};
        int delCol[]={0,1,0,-1};
        
        for(int i=0;i<m;i++){
            if(a[0][i]=='O'&&!visited[0][i])
            dfs(0,i,a,delRow,delCol,visited,n,m);
            
             if(a[n-1][i]=='O'&&!visited[n-1][i])
            dfs(n-1,i,a,delRow,delCol,visited,n,m);
        }
        
        for(int i=0;i<n;i++){
            if(a[i][0]=='O'&&!visited[i][0])
            dfs(i,0,a,delRow,delCol,visited,n,m);
            
             if(a[i][m-1]=='O'&&!visited[i][m-1])
            dfs(i,m-1,a,delRow,delCol,visited,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j])
                ans[i][j]='X';
                else ans[i][j]='O';
            }
        }
        return ans;
        
        
        
    }
    static void dfs(int row,int col,char a[][],int delRow[],int delCol[],boolean visited[][],int n,int m){
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int ncol=col+delCol[i];
            int nrow=row+delRow[i];
            if(ncol>=0&&ncol<m&&nrow>=0&&nrow<n&&!visited[nrow][ncol]&&a[nrow][ncol]=='O')
            dfs(nrow,ncol,a,delRow,delCol,visited,n,m);
        }
    }
}
