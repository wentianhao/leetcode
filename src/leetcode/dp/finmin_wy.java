package leetcode.dp;

import java.util.Arrays;

public class finmin_wy {
    static public int finmin(int[][]distance,int n){
        int [][]dp = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                if(i == j){
                    dp[i][i] = 0;
                }else{
                    dp[i][j] = 1001;
                }
            }
        int row = distance.length;
        int col = distance[0].length;
        for (int i=0;i<row;i++){
            dp[distance[i][0]][distance[i][1]] = distance[i][2];
            dp[distance[i][1]][distance[i][0]] = distance[i][2];
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j ){
                    if(i!=0){
                        dp[i][j] = Integer.min(dp[i][j],dp[i-1][j] + dp[i][i-1]);
                    }
                    if(j!=0){
                        dp[i][j] = Integer.min(dp[i][j],dp[i][j-1]+dp[j-1][j]);
                    }
                }
            }
        }
        dp = dp;
        return n;
    }
    public static void main(String []args){
        int [][] distance = {{0,1,3},{1,2,2},{0,2,1}};
        finmin(distance,3);
    }
}
