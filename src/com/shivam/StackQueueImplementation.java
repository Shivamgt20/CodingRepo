package com.shivam;
// import com.shivam.arrStack;

public class StackQueueImplementation {
    public static void main(String[] args) {

        /*
         * 
         * Stack Implementation
         * 
         */

        arrStack stack = new arrStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        // stack.display();
        // stack.pop();
        // stack.display();
        // System.out.println(stack.top());

        stactUsing2Q st1 = new stactUsing2Q();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.push(60);
        st1.push(70);
        st1.push(80);
        st1.push(90);
        // st1.display();
        // st1.pop();
        // st1.display();

        stackUsing1Q st2 = new stackUsing1Q();
        st2.push(10);
        st2.push(20);
        st2.push(30);
        st2.push(40);
        st2.push(50);
        st2.push(60);
        st2.push(70);
        st2.push(80);
        st2.push(90);
        // st1.display();
        // st1.pop();
        // st2.display();


        /*
         * 
         * Queue Implementation 
         * 
         */


        arrQueue queue = new arrQueue();
        queue.push(90);
        queue.push(80);
        queue.push(70);
        queue.push(60);
        queue.push(50);
        queue.push(40);
        queue.push(30);
        queue.push(20);
        queue.push(10);
        queue.display();
        // System.out.println(queue.peek());
        // System.out.println(queue.pop());
        // queue.display();


        qUsingStack q1 = new qUsingStack();
        q1.push(90);
        q1.push(80);
        q1.push(70);
        q1.push(60);
        q1.push(50);
        q1.push(40);
        q1.push(30);
        q1.push(20);
        q1.push(10);
        q1.display();
        // System.out.println(q1.peek());
        // System.out.println(q1.pop());
        // q1.display();


        qUsingStackOptimised q2 = new qUsingStackOptimised();
        q2.push(90);
        q2.push(80);
        q2.push(70);
        q2.push(60);
        q2.push(50);
        q2.push(40);
        q2.push(30);
        q2.push(20);
        q2.push(10);
        q2.peek();
        q2.display();

    }
}
