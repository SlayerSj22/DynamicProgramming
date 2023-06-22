package Recursion;

import java.util.Stack;

public class sortAstack {
    void sort(Stack<Integer> stack){
        if(stack.isEmpty())
        return;
        while(stack.size()>0){
              int t=stack.pop();
              sort(stack);
              insertSort(stack,t);
        }
    }
    void insertSort(Stack<Integer> stack,int t){
        if(stack.size()==0||stack.peek()<t)
       { stack.push(t);
        return;
    }
        int p=stack.pop();
        insertSort(stack,t);
        stack.push(p);
    }
}
