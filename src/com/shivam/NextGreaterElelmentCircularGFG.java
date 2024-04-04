package com.shivam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class NextGreaterElelmentCircularGFG {
    public static void main(String[] args) {
        long[] arr = {1,3,2,4};
        arr = nextLargerElement(arr, 4);
        System.out.println(arr);
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        Deque < Long > st = new ArrayDeque < > ();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    st.push(arr[i]);
                    arr[i] = -1;
                } else {
                    long temp = arr[i];
                    arr[i] = st.peek();
                    st.push(temp);
                }
            } else {
                st.push(arr[i % n]);
            }
        }

        return arr;
    }
}
