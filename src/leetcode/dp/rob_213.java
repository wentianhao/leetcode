package leetcode.dp;

import java.util.Arrays;
import java.util.Map;

public class rob_213 {
    static public int rob(int[] nums) {
        int len = nums.length;
        int max = 0;
        int[][]dp = new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i] = nums[i];
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if (j-i==1){
                    dp[i][j] = dp[i][j-1];
                    continue;
                }
                dp[i][j] = Math.max(dp[i][j-2] + nums[j],dp[i][j-1]);
                if (j-i>=3)
                    dp[i][j] = Math.max(dp[i][j],dp[i][j-3]+nums[j]);
                if (i==0 && j==len-1)
                    dp[i][j] = dp[i][j-1];
            }
            max = Math.max(max,Math.max(dp[i][len-1],dp[i][len-2]));
        }
        return max;
    }

    static public int rob1(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    static public int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }



    public static void main(String[]args){
        int[]nums = {1,1,3,1,1,3};
        System.out.println(rob1(nums));
    }
}
