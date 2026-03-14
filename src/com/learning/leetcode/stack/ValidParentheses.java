package com.learning.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String s)
    {
        //Stack<Character> stack = new Stack<>();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray())
        {
            if(c == '(')
            {
                stack.push(')');
            }
            else if(c == '{')
            {
                stack.push('}');
            }
            else if(c == '[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println(validParentheses(str));
    }
}
