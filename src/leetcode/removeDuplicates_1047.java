package leetcode;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicates_1047 {

    static class Solution {
        public String removeDuplicates(String S) {
            char[] chars = S.toCharArray();
            int end = -1;
            for (char c : chars){
                if (end == -1 || chars[end]!=c){
                    chars[++end] = c;
                }else{
                    end --;
                }
            }
            return String.valueOf(chars,0,end+1);
        }

    }

    public static void main(String []args){
        Solution s = new Solution();
        String S = "abbaca";
        System.out.println(s.removeDuplicates(S));
    }
}
