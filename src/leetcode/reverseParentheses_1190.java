package leetcode;

import java.util.Stack;

public class reverseParentheses_1190 {
    public static String reverseParentheses(String s){
        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(res.toString());
                res.setLength(0);
            }else if(s.charAt(i)==')'){
                res.reverse();
                res.insert(0,stack.pop());
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[]args){
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
}
