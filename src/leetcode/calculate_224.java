package leetcode;

import java.util.Stack;

public class calculate_224 {
    static class Solution {
        public int calculate(String s) {
            Stack<Integer> num = new Stack<>();
            int res = 0;
            int sign = 1;
            for (int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if (Character.isDigit(ch)){
                    int tmp = ch - '0';
                    while(i+1<s.length() && Character.isDigit(s.charAt(i+1)))
                        tmp = tmp * 10 + s.charAt(++i)-'0';
                    res = res + sign * tmp;
                }else if (ch == '+'){
                    sign = 1;
                }else if (ch == '-'){
                    sign = -1;
                }else if (ch == '('){
                    num.push(res);
                    res = 0;
                    num.push(sign);
                    sign = 1;
                }else if (ch ==')'){
                    res = num.pop()*res+num.pop();
                }
            }

            return res;
        }
    }

}
