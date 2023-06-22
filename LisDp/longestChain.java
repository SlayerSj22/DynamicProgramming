import java.util.Arrays;

public class longestChain {
     public int longestchain(int N, String words[]){

        for(int i = 0;i < N-1;i++){

            for(int j = 0;j < N-i-1;j++){

                if(words[j].length()>words[j+1].length()){

                    String temp = words[j];

                    words[j] = words[j+1];

                    words[j+1] = temp;

                }

            }

        }

        int dp[] = new int[N];

        Arrays.fill(dp,1);

        for(int i = 1;i < N;i++){

            for(int j = 0;j < i;j++){

                if(predecessor(words[i],words[j])){

                    dp[i] = Math.max(dp[i],1+dp[j]);

                }

            }

        }

        int ans = 0;

        for(int i = 0;i < N;i++){

            ans = Math.max(ans,dp[i]);

        }

        return ans;

    }

    public boolean predecessor(String x,String y){

        if(x.length()-y.length()!=1){

            return false;

        }

        else{

            int i = 0;

            int j = 0;

            boolean temp = true;

            while(i<x.length()&&j<y.length()){

                if(x.charAt(i)==y.charAt(j)){

                    i++;j++;

                }

                else{

                    if(!temp){

                        return false;

                    }

                    else{

                    temp = false;

                    i++;

                    }

                }

            }

            return true;

        }

    }
}
