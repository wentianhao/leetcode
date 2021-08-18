package leetcode.offer;

public class search {
    public static int search(int[] nums, int target) {
        int l = binarySearch(nums,target,true);
        int r = binarySearch(nums,target,false) - 1;
        if (r >= l && r <nums.length && nums[l] == nums[r]){
            return r - l + 1;
        }
        return  0;
    }
    public static int binarySearch(int[]nums,int target ,boolean flag){
        int l=0,r=nums.length-1,n = nums.length;
        while ( l <= r) {
            int mid = (l+r) / 2;
            if (nums[mid] > target || (flag && nums[mid] >= target)){
                r = mid - 1;
                n = mid;
            }else {
                l = mid + 1;
            }
        }
        return n;
    }
}
