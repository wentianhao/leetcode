package leetcode;

import java.util.Arrays;

public class largestNumber_179 {
    static class Solution {
        public String largestNumber(int[] nums) {
            String res = "";
            int sum = 0;
            for (int i=0;i<nums.length-1;i++){
                for (int j=0;j<nums.length-i-1;j++){
                    if (!compare(nums[j],nums[j+1])){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
            for (int n:nums){
                sum+=n;
                res = res+n;
            }
            if (sum==0)
                return "0";
            return res;
        }

        public Boolean compare(int i,int j){
            // 比较 i+j 和 j+i
            String s1 = String.valueOf(i) + String.valueOf(j);
            String s2 = String.valueOf(j) + String.valueOf(i);
            return Long.valueOf(s1)>=Long.valueOf(s2);
        }

    }
    public static void main(String []args){
        int []nums = {999999991,9};

        Solution s = new Solution();
        s.largestNumber(nums);
//        boolean a  =  s.compare(30,343);

    }
}
