package leetcode;

import java.util.ArrayList;
import java.util.List;

public class partition_131 {

    static class Solution{
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        public List<List<String>> partition(String s) {
            dfs(s,0);
            return res;
        }

        public void dfs(String s,int index){
            int n = s.length();
            if (index == n){
                res.add(new ArrayList<>(path));
                return;
            }

            for (int k=1;k<=n-index;k++){
                String tmp = s.substring(index,index+k);
                if (isPalin(tmp)){
                    path.add(tmp);
                    dfs(s,index+k);
                    path.remove(path.size()-1);
                }
            }
        }

        public boolean isPalin(String d){
            int len = d.length();
            for(int i=0;i<len/2;i++){
                if(d.charAt(i)!=d.charAt(len-1-i)){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String []args){
        String s = "aab";
        Solution so = new Solution();
        so.partition(s);
    }

}
