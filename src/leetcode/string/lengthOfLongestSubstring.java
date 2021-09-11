package leetcode.string;

import java.util.HashSet;
import java.util.Set;

// 无重复字符的最长字串
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        // 哈希集合，记录每个字符是否出现过
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int right = -1;
        int res = 0;
        for (int i=0;i<n;i++){
            if (i != 0){
                // 左指针向右移动一位，移除一个字符
                set.remove(s.charAt(i-1));
            }
            while (right+1 < n && ! set.contains(s.charAt(right+1))){
                // 右移
                set.add(s.charAt(right+1));
                right++;
            }

            res = Math.max(res,right-i+1);
        }
        return res;
    }
}
