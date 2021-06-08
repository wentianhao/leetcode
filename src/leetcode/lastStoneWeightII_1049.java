package leetcode;

public class lastStoneWeightII_1049 {
    /**
     *将石头划分为两堆，ki=1和ki=-1,所有石头质量之差的绝对值即是最小的划分
     * 总质量为sum,ki=-1的石头质量之和为neg，ki=1的石头的质量之和为sum-neg
     * obj = sum-2neg
     * 要使得最后一块石头尽可能的小，neg需要在不超过sum/2的前提下尽量大，
     * 因此本题可以看作是背包容量为[sum/2],物品重量和价值均为stonesi的0-1背包问题
     *
     * 对于该问题，定义二维boolean,dp,其中dp[i+1][j]表示前i个石头能够凑出重量j.
     * dp[0][]为不选任何石头的状态，除了dp[0][0]为真，其余dp[0][j]全为假
     * 对于第i个石头，考虑凑出重量j
     * 若j<stones[i],则不能选第i个石头，此时有dp[i+1][j]=dp[i][j]
     * 若j>=stones[i],则存在选或者不选两种决策，不选时dp[i+1][j] = dp[i][j],
     * 选时需要考虑能够凑出重量j-stones[i]，即dp[i+1][j] = dp[i][j-stones[i]]
     */
    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int s : stones)
            sum+=s;
        int n = stones.length;
        int m = sum / 2;
        boolean[][]dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i =0;i<n;i++){
            for (int j=0;j<=m;j++){
                if (j<stones[i])
                    dp[i+1][j] = dp[i][j];
                else{
                    dp[i+1][j] = dp[i][j] || dp[i][j-stones[i]];
                }
            }
        }
        for (int j=m;;--j){
            if (dp[n][j])
                return sum-2*j;
        }
    }

    public static void main(String[]args){

    }
}
