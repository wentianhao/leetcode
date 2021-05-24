package leetcode.dp;
public class strangePrinter_664 {
    static int strangePrinter(String s){
        int n = s.length();
        // dp[i][j] 表示打印完成区间[i,j]的最少操作数
        int [][]dp = new int[n][n];
        for (int i=n-1;i>=0;i--){
            dp[i][i]=1;
            for(int j=i+1;j<n;j++){
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i][j-1];
                }else{
                    int min = Integer.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        min = Math.min(dp[i][k]+dp[k+1][j],min);
                    }
                    dp[i][j] = min;
                }
            }
        }

        return dp[0][n-1];
    }
}
