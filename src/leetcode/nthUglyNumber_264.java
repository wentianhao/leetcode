package leetcode;

public class nthUglyNumber_264 {
    static class Solution{
        // 三指针
        public int nthUglyNumber(int n){
            int n2 = 0,n3=0,n5=0;
            int []res = new int[n];
            res[0] = 1;
            for (int i=1;i<n;i++){
                res[i] = Math.min(res[n2]*2,Math.min(res[n3]*3,res[n5]*5));
                if (res[i] == res[n2]*2)
                    n2++;
                if (res[i] == res[n3]*3)
                    n3++;
                if (res[i] == res[n5]*5)
                    n5++;
            }
            return res[n-1];
        }
    }
    public static void main(String[]args){
        Solution s= new Solution();
        int n = 10;
        System.out.println(s.nthUglyNumber(n));
    }
}
