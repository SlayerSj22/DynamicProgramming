package DpPartFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class printAllLCS {
    private void findAllLCS(String s, String t, StringBuilder temp, int i, int j, int length, List<String>ans, Set<String> st){
        
        if(length==0){
             if(st.contains(temp.toString()) == false){
                ans.add(temp.toString());
                st.add(temp.toString());
            }
            return;
        }
         if(i >= s.length() || j >= t.length()) return;
         
          for(int it1 = i; it1 < s.length(); it1++){
            for(int it2 = j; it2 < t.length(); it2++){
                if(s.charAt(it1) == t.charAt(it2)){
                    temp.append(s.charAt(it1));
                    findAllLCS(s, t, temp, it1+1, it2+1, length - 1, ans, st);
                    temp.deleteCharAt(temp.length()-1);//backTrack by removing last appended item
                }
            }
        }
        
        
        
        
    }
      int lcs(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                 if(s1.charAt(i-1)==s2.charAt(j-1))
                  dp[i][j]=dp[i-1][j-1]+1;
                  else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               
            }
        }
        return dp[x][y];
    }
    public List<String> all_longest_common_subsequences(String s, String t)
    {
        int n=s.length();
        int m=t.length();
        
        int maxLength=lcs(n,m,s,t);
        
         List<String> ans = new ArrayList<String>();
         Set<String> st = new HashSet<>();
         
         StringBuilder temp = new StringBuilder();
          findAllLCS(s, t, temp, 0, 0, maxLength, ans, st);
          
          Collections.sort(ans);
        return ans;
        
    }
}
