package leetcode.dp;

public class change_518 {
    public static int change(int amount, int[] coins) {
        int []dp = new int[amount+1];
        dp[0] = 1;
        for (int coin : coins){
            for (int j=0;j+coin<=amount;j++){
                dp[j+coin] += dp[j];
            }
        }
        return dp[amount];
    }
    public static void main(String[]args){
        int[]coins = {1,2,5};
        change(5,coins);
    }
}
