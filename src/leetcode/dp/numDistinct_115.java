package leetcode.dp;

public class numDistinct_115 {
    static class Solution {
        public int numDistinct(String s, String t) {
            int m = s.length();
            int n = t.length();
            // dp[i][j] 表示 s[0-i]和t[0-j]均闭区间的子序列个数，dp[0][x] 表示s空串，dp[x][0]表示t空串
            int [][]dp = new int[m+1][n+1];
            for (int i=0;i<= m;i++){
                dp[i][0] = 1;
            }
            for(int i= 1;i<= m;i++){
                for (int j =1 ;j<=n;j++){
                    if (s.charAt(i-1) == t.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[m][n];
        }
    }

    public static void main(String []args){
        Solution s = new Solution();
        String x = "abc";
        System.out.println((x.substring(0,1)+x.substring(2)).equals("acb"));

    }
}
