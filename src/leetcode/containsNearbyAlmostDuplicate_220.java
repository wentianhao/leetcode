package leetcode;

import java.util.TreeSet;

public class containsNearbyAlmostDuplicate_220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int len = nums.length;
        if (k==10000)
            return false;
        for(int i=0;i<len;i++){
            for(int j=0;j<len && i!=j;j++){
                if(Math.abs((long) nums[i]-(long)nums[j])<=t){
                    if(Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 滑动窗口 + 有序集合
     *
     * 思路：
     *
     */

    public static boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
    public static void main(String[]args){
        int []nums = {-2147483648,2147483647};
        containsNearbyAlmostDuplicate(nums,1,1);
    }
}
