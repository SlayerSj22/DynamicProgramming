

public class bitonic {
    
   public int LongestBitonicSequence(int[] nums)

    {

        int n = nums.length;

        int[] incDp = new int[n];

        

        for(int i=0;i<n;i++){

            incDp[i] = 1;

            for(int j=0;j<i;j++){

                if(nums[j] < nums[i] && incDp[j]+1 > incDp[i] ){

                    incDp[i] = incDp[j]+1; }  }

        }

        int[] decDp = new int[n];
        
         for(int i=n-1;i>=0;i--){

            decDp[i] = 1;

            for(int j=i+1;j<n;j++){

                if(nums[j] < nums[i] && decDp[j]+1 > decDp[i] ){

                    decDp[i] = decDp[j]+1;

                }

            }

        }

        int ans=0;

        

        for(int i=0;i<n;i++){

            ans = Math.max(ans,incDp[i]+decDp[i]-1);

        }


        return ans;

    }
}
