package leetcode.dp;

public class longestPalindrome_5 {
    private static String longestPalindrome(String s) {
        int len = s.length();
        for (int i=len;i>0;i--){
            for (int j=0;i+j<=len;j++){
                if (isPalindrome(s.substring(j,i+j)))
                    return s.substring(j,i+j);
            }
        }
        return s.substring(0,1);
    }
    private static Boolean isPalindrome(String s){
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    /**
     * 方法一：动态规划
        思路与算法
        对于一个子串，如果是回文串，并且长度大于2，去掉首尾俩字母仍为回文串
        s[i:j] ：表示字符串s的第i到第j个字母组成的串是否为回文串

        s[i:j] = false
        1. s[i:j] 不是回文串
        2. i > j

        s[i:j] = true
        s[i:j] = s[i+1:j-1} && s[i] == s[j]
       如果子串长度为1 or 2
        s[i:i]  == true
        s[i:i+1] == true
     */
    private static String longestPalindrome_1(String s){
        int len = s.length();
        if (len<2)
            return s;
        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示s[i...j]是否为回文串
        boolean[][]dp = new boolean[len][len];
        // 初始化，所有长度为1的子串都是回文串
        for (int i=0;i<len;i++)
            dp[i][i] = true;
        char[] chars =  s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int l = 2;l<=len;l++){
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i=0;i<len;i++){
                // 右边界 j =l-1+i
                int j = l+i-1;
                if (j>=len)
                    break;
                if (chars[i] != chars[j])
                    dp[i][j] = false;
                else {
                    if (j-i <3)
                        dp[i][j] = true;
                    else
                        dp[i][j] = dp[i+1][j-1];
                }

                if (dp[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    public static void main(String[]args){
        String s = "b";
        String x = longestPalindrome(s);
        System.out.println(x);
    }
}
