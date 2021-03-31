package leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    static class Solution {
        // 回溯模板
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> temp = new ArrayList<>();
            dfs(nums,temp,0);
            res.add(new ArrayList<>());
            return res;
        }

        public List<List<Integer>> res = new ArrayList<>();
        public void dfs(int []nums,List<Integer> temp,int len){
            for (int i=len;i<nums.length;i++){
                temp.add(nums[i]);
                res.add(new ArrayList<>(temp));
                dfs(nums, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String []args){
        int[] nums = {1,2,3};
        Solution s = new Solution();
        s.subsets(nums);
    }
}
