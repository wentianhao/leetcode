package leetcode;

import java.util.*;

public class displayTable_1418 {
    public static List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer,Map<String,Integer>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (List<String> list : orders){
            // 菜谱
            set.add(list.get(2));
            Map<String,Integer> m = map.getOrDefault(list.get(1),new HashMap<>()); // 桌子的所有菜
            m.put(list.get(2),m.getOrDefault(list.get(2),0)+1);
            map.put(Integer.parseInt(list.get(1)),m);
        }

        List<String> names = new ArrayList<>();
        for (String name : set){
            names.add(name);
        }
        Collections.sort(names);

        List<Integer> ids = new ArrayList<>();
        for (int id : map.keySet())
            ids.add(id);
        Collections.sort(ids);

        List<List<String>> play = new LinkedList<>();
        List<String> vegetable = new ArrayList<>();
        vegetable.add("Table");
        for (String n : names){
            vegetable.add(n);
        }

        play.add(vegetable);
        // 桌子遍历
        for (int id : ids){
            List<String> id2n = new LinkedList<>();
            id2n.add(String.valueOf(id));
            for (String n : names){
                id2n.add(String.valueOf(map.get(id).getOrDefault(n,0)));
            }
            play.add(id2n);
        }
        return play;
    }

    public static void main(String[]args){

        List<List<String>> orders = Arrays.asList(Arrays.asList("David","3","Ceviche"),
                Arrays.asList("Corina","10","Beef Burrito"),
                Arrays.asList("David","3","Fried Chicken"),
                Arrays.asList("Carla","5","Water"),
                Arrays.asList("Carla","5","Ceviche"),
                Arrays.asList("Rous","3","Ceviche"));

        displayTable(orders);


    }
}
