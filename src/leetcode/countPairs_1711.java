package leetcode;

import java.util.HashMap;
import java.util.Map;

public class countPairs_1711 {
    // 传统暴力方法,超时
    public int countPairs_v(int[] deliciousness) {
        int count = 0;
        for (int i = 0; i < deliciousness.length - 1; i++) {
            for (int j = i + 1; j < deliciousness.length; ++j) {
                int target = deliciousness[i] + deliciousness[j];
                if (target != 0 && (0 == (target & (target - 1)))) {
                    count++;
                }
            }
        }
        return (int) (count % (1e9 + 7));
    }

    /**
      哈希表存储数组中的每个元素出现的次数，遍历到某个元素时，
      在哈希表中寻找与当前元素的和等于2的幂的元素个数，
     然后用当前元素更新哈希表。
     */

    public int countPairs(int[] deliciousness) {
        final int MOD = 1000000007;
        int num = 0;
        int maxVal = 0; // 数组中最大的元素
        for (int delicious : deliciousness)
            maxVal = Math.max(maxVal,delicious);
        int maxSum = maxVal * 2; //数组中任意两个数之和都不会超过maxSum
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<deliciousness.length;i++){
            int val = deliciousness[i];
            for (int sum=1;sum<=maxSum;sum <<= 1){
                int count = map.getOrDefault(sum-val,0);
                num = (num + count) % MOD;
            }
            map.put(val,map.getOrDefault(val,0) + 1);
        }


        return num;
    }

    public static void main(String[]args){

    }
}