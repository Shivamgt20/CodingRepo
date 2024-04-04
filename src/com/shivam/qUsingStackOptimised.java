package com.shivam;

public class qUsingStackOptimised {
    private arrStack st1= new arrStack();
    private arrStack st2= new arrStack();

    public int peek(){
        if(!st2.isEmpty()){
            return st2.top();
        }

        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        return st2.top();
     }
 
     public int pop(){
        if(!st2.isEmpty()){
            return st2.pop();
        }

        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        return st2.pop();
     }
 
     public void push(int n){
         st1.push(n);
     }
 
     public void display(){
         st2.display();  // Not correct need to think about this again what if st1 empty, st2 empty, st1 and st2 have data 
     }
}



/*
 * 
 * push() TC = O(1)   SC = O(2N)
 * pop() TC = O(1) in most of the cases in some cases its O(N) as we need to shift data from st1 to st2 soo we can say its O(1) amotised 
 * peek() TC = O(1) in most of the cases in some cases its O(N) as we need to shift data from st1 to st2 soo we can say its O(1) amotised 
 * peek() 
 * 
 */