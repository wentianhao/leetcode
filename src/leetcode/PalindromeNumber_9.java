package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

     Example 1:

     Input: 121
     Output: true
     Example 2:

     Input: -121
     Output: false
     Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     Example 3:

     Input: 10
     Output: false
     Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber_9 {
    public static void main(String []args){
        Solution s = new Solution();
        int x = 121;
        System.out.println(s.isPalindrome(x));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            boolean flag = false;
            int a = x;
            int out = 0;
            List<Integer> l = new ArrayList<>();
            if (x>0){
                while(x / 10 != 0){
                    l.add(x%10);
                    x = x /10;
                }
                l.add(x);
            }else if(x==0){
                return true;
            } else {
                return false;
            }

            for (int i = 0;i<l.size();i++){
                out+= l.get(i)*(Math.pow(10,l.size()-i-1));
            }
            if (out == a){
                flag =true;
            }
            if (out >= Math.pow(2,31)-1)
                flag = false;
            return flag;
        }
    }

}
