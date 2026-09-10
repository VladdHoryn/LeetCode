package org.example;

import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        Stack<Character> res = new Stack<>();

        if(s.length() % 2 == 1)
            return false;

        for(int i = 0; i < s.length(); ++i){
            if(res.empty()) {
                res.push(s.charAt(i));
            }
            else if((res.peek() == '(' && s.charAt(i) == ')') ||
                    (res.peek() == '[' && s.charAt(i) == ']') ||
                    (res.peek() == '{' && s.charAt(i) == '}')){
                res.pop();
            }
            else{
                res.push(s.charAt(i));
            }
        }

        System.out.println(res);

        if(res.empty())
            return true;
        return false;
    }


    public static void main(String[] args) {

        System.out.println(isValid("([]{})"));
    }
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */