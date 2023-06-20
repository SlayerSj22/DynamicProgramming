package DpPartFour;

public class minNoOfinsertionOrDeletion {
    public int minOperations(String s1, String s2) 
	{ 
	    
	    int x=s1.length();
	    int y=s2.length();
	    
	     int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                 if(s1.charAt(i-1)==s2.charAt(j-1))
                  dp[i][j]=dp[i-1][j-1]+1;
                  else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               
            }
        }
         int deletion=s1.length()-dp[x][y];
         int insertion=s2.length()-dp[x][y];
         
	    return insertion+deletion;
	} 
}
