package leetcode;

public class findTargetSumWays_494 {
    static int count = 0;
    public static int findTargetSumWays(int[] nums, int target) {
        dfs(nums,target,0);
        return count;
    }
    public static void dfs(int[]nums,int S,int i){
        if(i==nums.length && S == 0){
            count++;
            return;
        }
        if(i<nums.length){
            dfs(nums,S-nums[i],i+1);
            dfs(nums,S+nums[i],i+1);
        }
    }
    public static void main(String[]args){
        int[]nums={1,1,1,1,1};
        System.out.println(findTargetSumWays(nums,3));
    }
}
