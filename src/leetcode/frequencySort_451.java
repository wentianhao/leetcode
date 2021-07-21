package leetcode;

import java.util.*;

public class frequencySort_451 {
    public static String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), 1);
            } else {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            }
        }
        Comparator<Map.Entry<Character, Integer>> valCmp = new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        };
        //将map转成List，map的一组key，value对应list一个存储空间
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(count.entrySet()); //传入maps实体
        Collections.sort(list, valCmp); // 注意此处Collections 是java.util包下面的,传入List和自定义的valCmp比较器
        //输出map
        for (int j = 0;  j< list.size(); j++) {
            res = String.valueOf(list.get(j).getKey() * list.get(j).getValue());
            System.out.println(list.get(j).getKey() + " = " + list.get(j).getValue());
        }
        return res;
    }
    public static void main(String[]args){
        String s = "";
    }
}
