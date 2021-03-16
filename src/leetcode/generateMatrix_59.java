package leetcode;

public class generateMatrix_59 {
    static class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int left = 0;
            int right = n -1;
            int top = 0;
            int bottom = n - 1;
            int num = n*n;
            int x = 1;
            while(x <= num){
                for (int i =left;i<=right && x<=num;i++){
                    matrix[top][i] = x;
                    x++;
                }
                top++;
                for (int i=top;i<=bottom && x<=num;i++){
                    matrix[i][right] = x;
                    x++;
                }
                right--;
                for (int i=right;i>=left && x<=num;i--){
                    matrix[bottom][i]=x;
                    x++;
                }
                bottom--;
                for (int i=bottom;i>=top && x<=num;i--){
                    matrix[i][left]=x;
                    x++;
                }
                left++;
            }

            return matrix;
        }
    }

    public static void main(String []args){
        Solution s = new Solution();
        int n = 3;
        int [][] m = s.generateMatrix(n);

    }
}
