public class countWays {
     int countways(int n)
    {
        // if(n==1)
        // return 1;
        // else if(n==2)
        // return 2;
        // else return countWays(n-1)+countWays(n-2);
        // above recursive approach can be converted into dp solution
        int mod=1000000007;
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        
       int prev=1;
       int next=1;
       int temp=prev+next;
       for(int i= 2;i<=n;i++){
         temp  =(prev+next)%mod;
         prev=next;
         next=temp;
       }
       return temp;
        
    }
}
