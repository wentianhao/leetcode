package leetcode;

import java.util.Scanner;

public class longDistance {
    public static void main(String[]args){
        int n = 4;
        int m = 8;
        int x = 2;

        int [][] a= new int[][]{{1, 2, 3}, {2,1,3},{1,4,5},{4,1,5},{3,1,2},{3,4,2},{2,4,1},{4,3,1}};

        int [][]d = new int[n][n];

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=n;j++ ){
                if (i==j)
                    d[i][j] = 0;
                else
                    if (a[i][0]==i && a[i][1]==j)
                        d[i][j] = a[i][3];
            }
        }


//        for (int k = 0;k < n;k++){
//           for (int i = 0;i<n;i++){
//               for (int j = 0;j<n;j++){
//
//               }
//           }
//        }

    }

//    static class Solution{
//        public int isLong(int[][] a) {
//
//        }
//    }
}
