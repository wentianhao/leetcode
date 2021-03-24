package leetcode;

import java.util.Map;

public class find132pattern_456 {
    static class Solution {
        public boolean find132pattern(int[] nums) {
            int n = nums.length;
            int min = nums[0];
            for(int i=0;i<n;i++){
                min = Math.min(min,nums[i]);
                if (min == nums[i]){
                    continue;
                }
                for (int j = n -1;j>i;j--){
                    if (min < nums[j] && nums[i] > nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String []args){
        Solution s = new Solution();
        int []nums = {1,2,3,4};
        s.find132pattern(nums);
    }
}
