package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutation_38 {
    public String[] permutation(String s){
        Set<String> set = new HashSet<>();
        char[]arrs = s.toCharArray();
        boolean[]visited = new boolean[s.length()];
        dfs(arrs,"",visited,set);
        return set.toArray(new String[0]);
    }
    public void dfs(char[]arrs,String res,boolean[]visited,Set<String> set){
        if(res.length() == arrs.length){
            set.add(res);
            return;
        }
        for (int i=0;i<arrs.length;i++){
            if (visited[i])
                continue;
            visited[i] = true;
            dfs(arrs, res+String.valueOf(arrs[i]), visited, set);
            visited[i] = false;
        }
    }
    // 回溯 + 剪枝
    public void dfs1(char[]arrs, int top, String s, boolean[] visited, List<String> list){

    }

}
