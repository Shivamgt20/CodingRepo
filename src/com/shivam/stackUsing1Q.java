package com.shivam;

public class stackUsing1Q {
    private arrQueue q = new arrQueue();

    public void push(int n){
        q.push(n);

        int size = q.size();
        while(--size > 0){
            q.push(q.peek());
            q.pop();
        }
    }

    public int pop(){
        return q.pop();
    }

    public int top(){
        return q.peek();
    }

    public void display(){
        q.display();
    }
}
