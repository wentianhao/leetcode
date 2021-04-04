package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class numRabbits_781 {
    static class Solution {
        public int numRabbits(int[] answers) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            int count = 0;
            int res = 0;
            for (int a : answers){
                if (hashMap.containsKey(a)){
                    count = hashMap.get(a) + 1;
                }else{
                    count = 1;
                }
                hashMap.put(a,count);
            }
            for (Integer key : hashMap.keySet()){
                //  3个1   3%1 + 1 = 4    3 个 aad10  10%3 + 10
                if (key == 0){
                    res = res + hashMap.get(key);
                }else{
                    res = res + (hashMap.get(key) + key)/(key+1)*(key+1);
                }
            }

            return res;
        }
    }
    public static void main(String[]args){
        Solution s = new Solution();
        int []answers = {1,0,1,0,0};
        int res = s.numRabbits(answers);
        System.out.println(res);
    }
}
