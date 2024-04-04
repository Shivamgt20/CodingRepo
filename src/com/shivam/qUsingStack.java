package com.shivam;

public class qUsingStack {
    private arrStack st1= new arrStack();
    private arrStack st2= new arrStack();


    public int peek(){
       return st1.top();
    }

    public int pop(){
        return st1.pop();
    }

    public void push(int n){
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        st1.push(n);

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public void display(){
        st1.display();
    }
}


/*
 * push() ---> TC = O(n)     SC = O(2n)
 * pop() ---> TC = O(1)
 * peek() ---> TC = O(1)
 */