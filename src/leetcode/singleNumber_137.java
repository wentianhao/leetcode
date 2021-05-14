//package leetcode;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class singleNumber_137 {
//    public int singleNumber(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int res = 0;
//        for(int n: nums){
//            map.put(n,map.getOrDefault(n,0)+1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue() == 1) {
//                res = entry.getKey();
//                break;
//            }
//        }
//        return res;
//    }
//    public int singleNumber1(int[]nums){
//        int a = 0,b=0;
//
//    }
//}
