package leetcode;

public class maxSumSubmatrix_363 {
    static int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[]sum = new int[row*col];
        int res = -1000;
        //1.顶点（0，0）到各个点的矩阵
        for(int i=0;i<row*col;i++){
            // 0(0,0) 1(0,1) 2(0,2)
            // 3(1,0)
            sum[i] = sumSubmatrix(matrix,i/col,i%col);
            if (sum[i] == k)
                return k;
            if (sum[i]<k && sum[i]>res)
                res = sum[i];
        }
        //2.行的所有矩阵
        for (int i=0;i<sum.length;i++){
            for (int j=i+1;j<((i/col)+1)*col;j++){
                if (sum[j]-sum[i]<=k && sum[j]-sum[i]>res)
                    res = sum[j]-sum[i];
            }
        }
        for (int i=0;i<col;i++){
            for (int j=1;j<row;j++)
                if (sum[j*col+i]-sum[i]<=k&& sum[j*col+i]-sum[i]>res)
                    res = sum[j*col+i]-sum[i];
        }
        return res;
    }
    static int sumSubmatrix(int[][]matrix,int row,int col){
        int sum = 0;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++)
                sum+=matrix[i][j];
        }
        return sum;
    }
    static int maxSumSubmatrix1(int[][] matrix, int k){
        // 顶点(i,j) 尾点(m,n)
        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int i=1;i<=row;i++)
            for (int j=1;j<=col;j++){
                int [][]dp = new int[row+1][col+1];
                dp[i][j] = matrix[i-1][j-1];
                for (int m=i;m<=row;m++)
                    for (int n=j;n<=col;n++){
                        dp[m][n] = dp[m-1][n] + dp[m][n-1]-dp[m-1][n-1]+matrix[m-1][n-1];
                        if (dp[m][n]<=k&& dp[m][n]>max)
                            max = dp[m][n];

                    }
            }
            return max;
    }
    public static void main(String[]args){
        int[][]matrix = {{5,-4,-3,4},{-3,-4,4,5},{5,1,5,-4}};
        int k = 8;
        int res = maxSumSubmatrix(matrix,k);
        System.out.println(res);
    }
}
