package leetcode;

public class removeDuplicates_80 {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums){
                if (i < 2 || n > nums[i]){
                    nums[i++] = n;
                }
            }
            return i;
        }
    }
    public static void main(String[]args){
        int[]nums = {0,0,1,1,1,1,2,3,3};
    }
}
