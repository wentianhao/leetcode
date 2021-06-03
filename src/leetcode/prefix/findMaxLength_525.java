package leetcode.prefix;

import java.util.HashMap;
import java.util.Map;

public class findMaxLength_525 {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int flag = 0;
        int[]prefix = new int[n+1];
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i] == 0)
                flag = flag -1;
            else
                flag = flag + 1;
            if(map.containsKey(flag)){
                res = Math.max(res,i-map.get(flag));
            }else{
                map.put(flag,i);
            }
        }

        return res;
    }
    public static void main(String[]args){
        int []nums = {0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(nums));
    }
}
