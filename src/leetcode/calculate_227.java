package leetcode;

import java.util.Stack;

public class calculate_227 {
    static class Solution {
        public int calculate(String s) {
            int num = 0;
            int res = 0;
            Stack<Integer> numStack = new Stack<>();
            char sign = '+';
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if (ch >= '0'){
                    num = num*10 + ch - '0';
                }
                if ((ch < '0' && ch !=' ')|| i == s.length()-1) {
                    switch (sign) {
                        case '+':
                            numStack.push(num);
                            break;
                        case '-':
                            numStack.push(-num);
                            break;
                        case '*':
                            numStack.push(numStack.pop() * num);
                            break;
                        case '/':
                            numStack.push(numStack.pop() / num);
                            break;
                    }
                    num = 0;
                    sign = ch;
                }

            }
            while(!numStack.isEmpty()){
                res +=numStack.pop();
            }
            return res;
        }
    }

    public static void main(String []args){
        Solution x = new Solution();
        String s = "0-2147483647";
        int res = x.calculate(s);
        System.out.println(res);
    }

}


