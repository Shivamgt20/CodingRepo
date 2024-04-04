package com.shivam;

public class stactUsing2Q {
     
    private arrQueue q1 = new arrQueue();
    private arrQueue q2 = new arrQueue();

    public void push(int n){
        q2.push(n);

        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
        qSwap(q1, q2);
    }

    private void qSwap(arrQueue q1, arrQueue q2){
        arrQueue temp = this.q1;
        this.q1 = this.q2;
        this.q2 = temp;
    }


    public int pop(){
        return q1.pop();
    }

    public int top(){
        return q1.peek();
    }

    public void display(){
        q1.display();
    }
}
