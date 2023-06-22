

public class Lis {
    static int ceil(int a[],int l,int r,int x){
        while(r>l){
            int mid=(r+l)/2;
            if(a[mid]>=x)
            r=mid;
            else l=mid+1;
        }
        return r;
    }
    static int longestSubsequence(int size, int a[])
    {
        int tail[]=new int[size];
        int length=1;
        tail[0]=a[0];
        for(int i=1;i<size;i++){
            if(a[i]>tail[length-1]){
                tail[length]=a[i];
                length++;
            }
            else{
                int c=ceil(tail,0,length-1,a[i]);
                int temp=tail[c];
                tail[c]=a[i];
                a[i]=temp;
            }
        }
        return length;
    }
}
