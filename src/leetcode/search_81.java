package leetcode;

public class search_81 {
    static class Solution {
        public boolean search(int[] nums, int target) {
            int n = nums.length;
            if (n==0)
                return false;
            if (n==1)
                return target == nums[0];
            // 二分查找
            int l = 0,r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                if (target == nums[mid])
                    return true;

                // 出现重复情况,无法判断有序区间，左边界+1，右边界-1
                if (nums[l] == nums[mid] && nums[mid] == nums[r]){
                    ++l;
                    --r;
                }else if (nums[l]<= nums[mid]){  // 【l,mid】 有序区间
                    if (nums[l] <= target && target <= nums[mid]){
                        r = mid - 1;
                    }else{
                        l = mid + 1;
                    }
                }else{ //【mid,r】有序区间
                    if (nums[mid]<target && target<=nums[mid-1]){
                        l = mid + 1;
                    }else{
                        r = mid - 1;
                    }
                }
            }

            return false;
        }
    }

}
