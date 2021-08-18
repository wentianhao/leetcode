package leetcode.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i =0;i<n-1;i++){
//            if (nums[i] == nums[i+1]){
//                return nums[i];
//            }
//        }
//        return -1;
        Set<Integer> set = new HashSet<>();
        for (int n:nums){
            if (!set.add(n)){
                return n;
            }
        }
        return -1;
    }
}
