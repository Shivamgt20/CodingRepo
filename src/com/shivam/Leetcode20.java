package com.shivam;

import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                char p = stack.pop();
                if ((ch == ')' && p == '(') || (ch == '}' && p == '{') || (ch == ']' && p == '['))
                    continue;
                else
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
