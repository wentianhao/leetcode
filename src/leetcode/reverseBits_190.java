package leetcode;

public class reverseBits_190 {
    static public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            return Integer.reverse(n);
        }
        public int reverseBits1(int n){
            int ans = 0;
            for (int i=0;i<32;i++){
                int y = n >>i;
                int  t = y & 1;
                if (t ==1){
                    ans |= (1<<(32-i));
                }
            }
            return ans;
        }
    }

    public static void main(String []arg){
        int n =43261596;
        Solution s = new Solution();
        int res  = s.reverseBits1(n);
        System.out.println(res);
    }
}
