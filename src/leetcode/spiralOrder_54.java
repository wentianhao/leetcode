package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int left = 0;
            int right = matrix[0].length - 1;
            int top = 0;
            int bottom = matrix.length - 1;
            int num = matrix.length * matrix[0].length;
            while (num >= 1 ){
                for (int i = left;i <= right && num >=1; i++){
                    res.add(matrix[top][i]);
                    num -- ;
                }
                top++;
                for (int i = top;i <= bottom && num>=1;i++){
                    res.add(matrix[i][right]);
                    num--;
                }
                right--;
                for (int i = right;i>=left && num>=1;i--){
                    res.add(matrix[bottom][i]);
                    num--;
                }
                bottom--;
                for (int i = bottom;i>=top&&num>=1;i--){
                    res.add(matrix[i][left]);
                    num--;
                }
                left++;
            }
            return res;
        }

    }

    public static void main(String []args){
        Solution s = new Solution();
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    }
}
