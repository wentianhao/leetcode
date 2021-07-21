package leetcode;

import java.util.*;

public class maxFrequency_1838 {
    // 枚举
    public static int maxFrequency(int[] nums, int k) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int ans = 1;
        for (int i=0;i<list.size();i++){
            int x = list.get(i),cnt = map.get(x);
            int p = k;
            for (int j = i-1;j>=0;j--) {
                int y = list.get(j);
                int diff = x - y;
                if (p >= diff) {
                    int add = p / diff;
                    int min = Math.min(map.get(y), add);
                    p -= min * diff;
                    cnt += min;
                } else
                    break;
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }

    public static void main(String[]args){
        int []nums = {1,1,1,1,100};
        System.out.println(maxFrequency(nums,100));
    }
}
