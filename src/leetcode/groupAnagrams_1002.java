package leetcode;

import java.util.*;

public class groupAnagrams_1002 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            if (!map.containsKey(String.valueOf(chars))){
                List<String> tmp = new ArrayList<>();
                tmp.add(s);
                map.put(String.valueOf(chars),tmp);
            }else{
                map.get(String.valueOf(chars)).add(s);
            }
        }
        for (String key : map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
