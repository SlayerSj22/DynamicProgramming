package DpPartFour;

public class wildPattern {
     boolean isAllStars(String S1, int i) {

    
    for (int j = 1; j <= i; j++) {
      if (S1.charAt(j - 1) != '*')
        return false;
    }
    return true;
  }
    int wildCard(String S1, String S2)
    {
         int n = S1.length();
    int m = S2.length();

    boolean dp[][] = new boolean[n + 1][m + 1];
    dp[0][0] = true;

    for (int j = 1; j <= m; j++) {
      dp[0][j] = false;
    }
    for (int i = 1; i <= n; i++) {
      dp[i][0] = isAllStars(S1, i);
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {

        if (S1.charAt(i - 1) == S2.charAt(j - 1) || S1.charAt(i - 1) == '?')
          dp[i][j] = dp[i - 1][j - 1];

        else {
          if (S1.charAt(i - 1) == '*')
            dp[i][j] = dp[i - 1][j] || dp[i][j - 1];

          else dp[i][j] = false;
        }
      }
    }

    if(dp[n][m])
    return 1;
    else return 0;

    }
}
