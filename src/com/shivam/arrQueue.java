package com.shivam;

public class arrQueue {
    private int[] arr = new int[10];
    private int front = -1, rear = -1, count = 0;

    public void push(int n){
        if(count == arr.length){
            System.out.println("Queue full !!!");
            return;
        }

        if(front==-1 && rear ==-1){
            front++; rear++;
            arr[rear++] = n; 
            count++;
            return;
        }

        arr[rear % arr.length] = n;
        rear++; count++;
    }

    public int pop(){
        if(count == 0) return -1;

        count--;
        return arr[front++ % arr.length];
    }

    public int peek(){
        return (count==0) ? -1 : arr[front % arr.length];
    }
    
    public void display(){
        int i = rear;
        while(i-- > front){
        System.out.print( arr[i % arr.length] + " => ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }
}
