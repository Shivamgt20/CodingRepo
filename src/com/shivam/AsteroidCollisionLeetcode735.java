package com.shivam;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollisionLeetcode735 {
    public static void main(String[] args) {
        int[] asteroids = { -2, -1, 1, -2 };

        int[] ans =  asteroidCollision(asteroids);
        System.out.println();
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : asteroids) {
            if (stack.isEmpty() || stack.peek() > 0 && num > 0 || stack.peek() < 0 && num < 0
                    || stack.peek() < 0 && num > 0) {
                stack.push(num);
            } else {
                int prev = stack.peek();
                while (!stack.isEmpty() && stack.peek() >0 && Math.abs(stack.peek()) < Math.abs(num)) {
                    prev = stack.peek();
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(num)) {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() < 0 || stack.isEmpty() && Math.abs(num) > prev) {
                    stack.push(num);
                }
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.peek();
            stack.pop();
        }

        return ans;
    }
}