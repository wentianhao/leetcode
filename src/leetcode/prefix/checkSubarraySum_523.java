package leetcode.prefix;
import java.util.Map;
import java.util.HashMap;

public class checkSubarraySum_523 {
    // TLE 93例没过
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[]dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = nums[i];
            for(int j=i+1;j<n;j++){
                dp[j]= dp[j-1] + nums[j];
                if(dp[j]%k==0)
                    return true;
            }
        }
        return false;
    }
    // 余数 & 前缀和

    /**
     *1.创建一个哈希表，key来存储当前前缀和的余数，value存储对应的index
     * 2.如果哈希表肿存在其对应的余数，取出pos，index-pos > 2 true
     * 3.不存在则保存到哈希表中
     */

    public static boolean checkSubarraySum1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int []sum = new int[n+1];
        int remainder = 0;
        map.put(0, -1);
        for (int i=0;i< n;i++){
            remainder = (remainder+nums[i])%k;
            if (map.containsKey(remainder)){
                int pos = map.get(remainder);

                if (i - pos >=2)
                    return true;
            }else{
                map.put(remainder,i);
            }
        }
        return false;
    }
    public static void main(String []args){
        int []nums = {23,2,4,6,6};
        checkSubarraySum1(nums,7);
    }
}
