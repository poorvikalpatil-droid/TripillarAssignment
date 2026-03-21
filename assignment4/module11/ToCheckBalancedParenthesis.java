package com.assignment4.module11;


import java.util.Stack;

public class ToCheckBalancedParenthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(str + " is balanced? " + isBalanced(str));
    }
}
