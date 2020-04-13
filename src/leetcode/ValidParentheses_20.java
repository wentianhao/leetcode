package leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

     An input string is valid if:

     Open brackets must be closed by the same type of brackets.
     Open brackets must be closed in the correct order.
     Note that an empty string is also considered valid.

     Example 1:

     Input: "()"
     Output: true
     Example 2:

     Input: "()[]{}"
     Output: true
     Example 3:

     Input: "(]"
     Output: false
     Example 4:

     Input: "([)]"
     Output: false
     Example 5:

     Input: "{[]}"
     Output: true
 */
public class ValidParentheses_20 {
    public static void main(String []args){
        Solution s = new Solution();
        String h = "]";
        boolean f = s.isValid(h);
        System.out.println(f);
    }
    static class Solution {
        public boolean isValid(String s) {
            if (s == null)
                return true;
            char [] a = s.toCharArray();
            Stack<String> b = new Stack<>();
            for (char c : a){
                if (c == '(' || c == '[' || c =='{'){
                    String temp = String.valueOf(c);
                    b.push(temp);
                }else {
                    if (b.empty())
                        return false;
                    String d = b.pop();
                    if (d.equals("("))
                        d = ")";
                    if (d.equals("["))
                        d = "]";
                    if (d.equals("{"))
                        d = "}";
                    if (!(String.valueOf(c).equals(d))){
                        return false;
                    }
                }
            }
            if (!b.empty())
                return false;
            return true;
        }
    }
}
