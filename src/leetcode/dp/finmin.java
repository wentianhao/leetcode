package leetcode.dp;

import java.util.Arrays;
import java.util.Map;

public class finmin {
    public static int findmin(int n,int[]d){
        int index = 0;
        int[]dp = new int[n];
        Arrays.fill(dp,n);
        dp[0] = 0;
        while(index<n){
            int i = index + 1;
            int j = index + d[index] + 1;
            for (int k = i;k<j;k++)
                if (k<n)
                    dp[k] = Math.min(dp[index] + 1,dp[k]);
            index+=1;
        }
        return dp[n-1];
    }
    public static void main(String[]args){
        int []d={1,3,2,1,1,2,3,4};
        System.out.println(findmin(d.length,d));
    }
}
