package leetcode;

import java.util.Stack;

public class evalRPN_150 {
    static class Solution {
        Stack<Integer> num = new Stack<>();
        public int evalRPN(String[] tokens) {
            int res = 0;
            for (String s : tokens){
                if (! (s.equals("+")  || s.equals("-") || s.equals("*") || s.equals("/")) ){
                    int n = Integer.parseInt(s);
                    num.push(n);
                }else{
                    switch (s){
                        case "+":
                            res = num.pop() + num.pop();
                            num.push(res);
                            break;
                        case "-":
                            int temp = num.pop();
                            res = num.pop() - temp;
                            num.push(res);
                            break;
                        case "*":
                            res = num.pop() * num.pop();
                            num.push(res);
                            break;
                        case "/":
                            temp = num.pop();
                            res = num.pop() / temp;
                            num.push(res);
                            break;
                    }

                }

            }
            return num.pop();
        }
    }

    public static void main(String []args){
        Solution s = new Solution();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(s.evalRPN(tokens));
    }
}
