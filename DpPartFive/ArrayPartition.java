package DpPartFive;

public class ArrayPartition {
    public int solve(int N, int k, int arr[]){
        int dp[]=new int[N+1];
        
        for(int i=N-1;i>=0;i--){
            int ans=Integer.MIN_VALUE;
            int length=0;
            int max_element=Integer.MIN_VALUE;
            for(int j=i;j<Math.min(i+k,N);j++){
                length++;
                max_element=Math.max(arr[j],max_element);
                int sum=max_element*length+dp[j+1];
                ans=Math.max(sum,ans);
                
            }
            dp[i]=ans;
        }
        return dp[0];
    }
}
