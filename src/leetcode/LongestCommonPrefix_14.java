package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.

     If there is no common prefix, return an empty string "".

     Example 1:

     Input: ["flower","flow","flight"]
     Output: "fl"
     Example 2:

     Input: ["dog","racecar","car"]
     Output: ""
     Explanation: There is no common prefix among the input strings.
     Note:

     All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix_14 {
    public static void main(String []args){
        Solution s = new Solution();
        String []strs = {"aa","aac"};
        String res = s.longestCommonPrefix(strs);
        System.out.println(res);
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
           if (strs.length ==0)
               return "";
           String s = strs[0];
           for (int i = 1;i<strs.length;i++){
               int a = strs[i].indexOf(s);
               while (strs[i].indexOf(s)!=0){
                   s = s.substring(0,s.length()-1);
                   if (s.isEmpty())
                       return "";
               }
           }
           return s;
        }
    }
}
