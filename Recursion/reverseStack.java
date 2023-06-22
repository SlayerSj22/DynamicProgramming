package Recursion;

import java.util.Stack;

public class reverseStack {
    void insert(Stack<Integer> st,int t)
{
    if(st.isEmpty())
    {
        st.push(t);
        return;
    }
    int x=st.pop();
    
    insert(st,t);
    st.push(x);
}
void solve(Stack<Integer> st)
{
    if(st.size()==1)
    {
        return;
    }
    int t=st.pop();
    
    solve(st);
    insert(st,t);
}
    void Reverse(Stack<Integer> st){
        if(st.empty())
        {
            return;
        }
        solve(st);
    }
}
