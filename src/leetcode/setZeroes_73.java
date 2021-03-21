package leetcode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class setZeroes_73 {
    static class Solution {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            List<Integer> x = new ArrayList<>();
            for(int m = 0;m<row;m++){
                for(int n = 0;n<col;n++){
                    if(matrix[m][n] == 0){
                        x.add(m);
                        x.add(n);
                    }

                }
            }
            for (int i = 0;i<x.size();i=i+2){
                zeroes(matrix,x.get(i),x.get(i+1));
            }
        }
        static public void zeroes(int[][] matrix,int i,int j){
            int row = matrix.length;
            int col = matrix[0].length;
            // 行 为 0
            for(int m = 0;m<row;m++){
                matrix[m][j] = 0;
            }
            //列为0
            for(int n=0;n<col;n++){
                matrix[i][n] = 0;
            }
        }
    }

    public static void main(String []args){
        Solution s = new Solution();
        int [][] matrix ={{1,1,1},{1,0,1},{1,1,1}};
        s.setZeroes(matrix);
    }

}
