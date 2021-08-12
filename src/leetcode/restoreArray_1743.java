package leetcode;

import java.util.HashMap;
import java.util.Map;

public class restoreArray_1743 {
    public int[] restoreArray(int[][]adjacentPairs){
        Map<Integer,Integer>map = new HashMap<>();
        Map<int[],Boolean> a = new HashMap<>();
        for (int[]adj:adjacentPairs){
            map.put(adj[0],map.getOrDefault(adj[0],0)+1);
            map.put(adj[1],map.getOrDefault(adj[1],0)+1);
            a.put(adj,false);
        }
        int[]res = new int[adjacentPairs.length+1];
        //找到头结点
        for (Integer entry:map.keySet()){
            if (map.get(entry) == 1){
                res[0] = entry;
                break;
            }
        }
        for(int i=1;i<res.length;i++){
            for(int[] adj :a.keySet()){
                if (!a.get(adj)){
                    if (adj[0] == res[i-1]){
                        res[i] = adj[1];
                        a.put(adj,true);
                    }
                    if (adj[1] == res[i-1]){
                        res[i] = adj[0];
                        a.put(adj,true);
                    }
                }

            }
        }
        return res;

    }
}
