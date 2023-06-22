package Recursion;

public class powNR {
     long mod = 1000000007;    
    long power(int N,int R)
    {
        //Your code here
        if(R == 0) return 1;
        else if(R == 1) return N;
        
        if(R % 2 != 0) {
            return (long)(N * power(N, R - 1)) % (this.mod);
        } 
        long n = power(N, R/2);
        return (n * n) % (this.mod);
        
    }
}
