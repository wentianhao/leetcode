package leetcode;

public class findMin_154 {
    static class Solution {
        public int findMin(int[] nums) {
           int len = nums.length;
           int l = 0;
           int r = len-1;
           while(l<r){
               int mid = (l+r)/2;
               if (nums[mid]< nums[r]){
                   r = mid;
               }else if (nums[mid] > nums[r]){
                   l = mid +1;
               }else{
                   r -- ;
               }
           }
           return nums[l];
        }
    }
}
