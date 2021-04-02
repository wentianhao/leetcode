package leetcode;

import java.util.Stack;

public class trap_17_21 {
    static class Solution {
        public int trap(int[] height) {
            int res = 0;
            int left = 0;
            int right = height.length-1;
            int l = height[left];
            int r = height[right];
            while (right-left>1){
                if (height[left]<=height[right]){
                    left++;
                    if (l >= height[left])
                        res = res + l - height[left];
                    else
                        l = height[left];
                }
                else{
                    right--;
                    if (r>= height[right])
                        res = res + r- height[right];
                    else
                        r = height[right];
                }
            }
            return res;
        }
    }
    public static void main(String[]args){
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution s = new Solution();
        int res = s.trap(height);
        System.out.println(res);
    }
}
