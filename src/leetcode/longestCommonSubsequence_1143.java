package leetcode;

public class longestCommonSubsequence_1143 {
    /**
     * 做了几个dp的题之后，总结了dp需要注意的几个要素：

     1、 明确dp二维数组表示的含义

     2、base case

     3、状态的转移：对于回文/LCS之类的问题则是考虑当前字串和已经计算过的子串之间的关系

     4、由状态的转移来确定 loop的边界

     5、 由loop的边界打出表格 可得出最后一个dp的状态值，即结果。

     1.对于s[1,...,i] s[1,...,j] LCS 长度为 dp[i][j]
     2.base case 一个字符串和自身没有子序列 dp[0][j] = dp[i][0] = 0
     3.dp[i][j] = dp[i-1][j-1] + 1
     4. for i in range(n+1):
            for j in range(m+1):
     5.dp[n][m]
     */
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            // dp
            int n = text1.length();
            int m = text2.length();
            int [][] dp = new int[n+1][m+1];

            for (int i=0;i<n+1;i++){
                for (int j=0;j<m+1;j++){
                    dp[0][j] = dp[i][0] = 0;
                }
            }

            for (int i=1;i<n+1;i++){
                for (int j=1;j<m+1;j++){
                    if (text1.charAt(i-1) == text2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else{
                        dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[n][m];
        }
    }
    public static void main(String[]args){
        String text1 = "abcba";
        String text2 = "abcbcba";
        Solution s = new Solution();
        int count = s.longestCommonSubsequence(text1,text2);
        System.out.println(count);
    }
}
