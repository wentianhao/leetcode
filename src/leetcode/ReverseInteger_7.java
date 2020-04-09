package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. ReverseInteger
 * Given a 32-bit signed integer, reverse digits of an integer.

     Example 1:

     Input: 123
     Output: 321
     Example 2:

     Input: -123
     Output: -321
     Example 3:

     Input: 120
     Output: 21
     Note:
     Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
     For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger_7 {
    public static void main(String []args){
        Solution s = new Solution();
        int x = 1534236469;
        int res = s.reverse(x);
        System.out.println(res);
    }
    static class Solution {
        public int reverse(int x) {
            int res = 0;
            int flag = 1;
            List<Integer> l = new ArrayList<>();
            if (x<0){
                x = -x;
                flag = -1;
            }
            if (x>0){
                while(x / 10 != 0){
                    l.add(x%10);
                    System.out.println(x%10);
                    x = x /10;
                }
                l.add(x);
            }

            for (int i = 0;i<l.size();i++){
                res+= l.get(i)*(Math.pow(10,l.size()-i-1));
            }

            if (res >= Math.pow(2,31)-1)
                res = 0;

            if (flag<0){
                res = -res;
            }
            return res;
        }
    }
}
