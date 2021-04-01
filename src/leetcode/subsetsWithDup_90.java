package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup_90 {
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<Integer> list = new ArrayList<>();
            res.add(new ArrayList<>());
            Arrays.sort(nums);
            dfs(nums,list,0);
            return res;
        }
        public List<List<Integer>> res = new ArrayList<>();
        public void dfs(int[]nums,List<Integer>list,int len){
            for (int i=len;i<nums.length;i++){
                if (i > len && nums[i-1] == nums[i]){
                    continue;
                }
                list.add(nums[i]);
                res.add(new ArrayList<>(list));
                dfs(nums, list, i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String []args){
        int[] nums = {1,2,2};
        Solution s = new Solution();
        s.subsetsWithDup(nums);
    }
}
