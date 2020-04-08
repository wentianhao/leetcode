package leetcode;

import java.util.Arrays;

/**
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     Example:

     Given nums = [2, 7, 11, 15], target = 9,

     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
 */

public class TwoSum_1 {
    public static void main(String[] args){
        int []nums={2,7,11,15};
        int target = 9;
        Solution s = new Solution();

        int res[] = {0,0};
        res = s.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }

    //暴力法
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int res[] = {0,0};
            for (int i = 0;i<nums.length;++i){
                for (int j = i+1;j<nums.length;++j){
                    if (target == (nums[i] + nums[j])){
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            return res;
        }
    }
}
