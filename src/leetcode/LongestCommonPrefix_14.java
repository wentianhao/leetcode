package leetcode;

import java.util.ArrayList;
import java.util.List;

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
