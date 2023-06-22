package Recursion;

import java.util.LinkedList;
import java.util.List;

public class generateBinaryString {
    static void generate(char ch[],List<String> ll,int k,int i){
             if(i==k){
                ll.add(ch.toString());
                return ;
             }
             if(ch[i-1]=='0'){
                ch[i]='0';
                generate(ch, ll, k, i+1);
                ch[i]='1';
                generate(ch, ll, k, i+1);
             }
             if(ch[i-1]=='1'){
                ch[i]='0';
                generate(ch, ll, k, i+1);
                
             }
    }

    static void fun(List<String> ll,int k){
        char ch[]=new char[k];
        ch[0]='0';
        generate(ch,ll,k,1);
        ch[0]='1';
        generate(ch,ll,k,1);
    }
   


     public static void main(String[] args) {
        int k=3;
       
        List<String> ll=new LinkedList<>();
         fun(ll,k);
         for(String a:ll){
            System.out.println(a);
         }
        

    }
}
