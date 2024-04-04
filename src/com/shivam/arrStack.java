package com.shivam;

public class arrStack {
        private int[] arr = new int[10];
        private int top = -1;

        public void push(int n){
            if(top == arr.length){
                System.out.println("Stack full. NO SPACE LEFT!!");
                return;
            }

            arr[++top] = n;
        }

        public int top(){
            return (top == -1) ? -1 : arr[top];
        }

        public int pop(){
            return arr[top--];
        }
        
        public int size(){
            return top+1;
        }

        public void display(){
            for(int i = 0; i<=top; i++){
                System.out.print(arr[i] + " => ");
            }
            System.out.println();
        }

        public boolean isEmpty(){
            return top == -1;
        }
}
