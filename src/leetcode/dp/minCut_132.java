package leetcode.dp;

public class minCut_132 {
    static class Solution {
        public int minCut(String s) {
            int len = s.length();
            int[][] dp = new int[len][len];
            for(int k=1;k<len;k++){
                for(int i=0;i<len-k;i++){
                    int j=i+k;
                    String tmp = s.substring(i,j+1);
                    if(!isPalin(tmp)){
                        dp[i][j]=Integer.MAX_VALUE;
                        for(int l=i;l<j;l++){
                            dp[i][j]=Math.min(dp[i][j],dp[i][l]+dp[l+1][j]+1);
                        }
                    }
                }
            }
            return dp[0][len-1];
        }

        public boolean isPalin(String s){
            int len = s.length();
            for (int i=0;i<len/2;i++){
                if(s.charAt(i)!=s.charAt(len-i-1)){
                    return false;
                }
            }
            return true;
        }

    }

    static class Solution1 {
        public int minCut(String s) {
            int len = s.length();
            int[] dp = new int[len+1];
            dp[0] = -1;
            for(int k=1;k<=len;k++){
                dp[k] = k-1;
                for(int i=k;i>=1;i--){
                    String tmp = s.substring(i-1,k);
                    if(isPalin(tmp)){
                        dp[k]=Math.min(dp[k],dp[i-1]+1);
                    }
                }
            }
            return dp[len];
        }

        public boolean isPalin(String s){
            int len = s.length();
            for (int i=0;i<len/2;i++){
                if(s.charAt(i)!=s.charAt(len-i-1)){
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String []args){
        Solution1 x = new Solution1();
        String s = "aabcc";
        System.out.println(x.minCut(s));
    }
}
