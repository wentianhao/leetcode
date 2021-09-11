package leetcode.offer;

public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean flag;
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        for(int[] m : matrix){
            if(m[0] > target){
                continue;
            }else {
                flag = binarySearch(m,target);
                if (flag){
                    return flag;
                }
            }
        }
        return false;
    }

    public boolean binarySearch(int [] m,int target) {
        int l = 0 ,r = m.length - 1;
        while(l <= r) {
            int mid = (l+r) / 2;
            if (m[mid] < target) {
                l = mid + 1;
            }else if (m[mid] > target) {
                r = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray1(int[][] matrix,int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int row = matrix.length,col = matrix[0].length;
        int r = 0,c = col - 1;
        while (r < row && c >= 0){
            if (matrix[r][c] == target){
                return true;
            } else if (matrix[r][c] < target){
                // 往下
                r++;
            } else {
                // 往左
                c -- ;
            }
        }
        return false;
    }
}
