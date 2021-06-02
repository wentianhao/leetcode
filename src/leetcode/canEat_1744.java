package leetcode;

public class canEat_1744 {
    static public boolean[] canEat(int[] candiesCount,int[][] queries){
        int n = queries.length;
        boolean[]res = new boolean[n];
        long[]sum = new long[n+1];
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1] + candiesCount[i-1];
        }
        for (int i=0;i<n;i++){
            // 第x天最少能吃到的糖果的编号(从0开始)
            long min = queries[i][1];
            //第x天最多能吃到的糖果编号(从0开始)
            long max = (long)queries[i][2]*(long)(queries[i][1]+1)-1;
            // 指定类别糖果的最小编号
            long low = sum[queries[i][0]];
            // 指定类别糖果的最大编号
            long high = sum[queries[i][0]+1] -1;
            res[i] = max>=low && min<=high;
        }
        return res;
    }

    public static void main(String[]args){

    }
}
