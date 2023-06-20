package DpPartFour;

public class makePalindrome {
    static int countMin(String S)
    {
        int n = S.length();
        
        StringBuilder st = new StringBuilder();
        st.append(S);
        st.reverse();
        
        String B = st.toString();
        
         int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i)
        {
            for (int j = 1; j <= n; ++j)
            {
               
                
                    if (S.charAt(i - 1) == B.charAt(j - 1))
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max (dp[i - 1][j], dp[i][j - 1]);
                
            }
        }
        return S.length()-dp[n][n];
    }
}
