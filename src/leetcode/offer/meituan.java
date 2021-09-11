package leetcode.offer;

import java.util.*;

public class meituan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String m = scanner.nextLine();
        int nlen = n.length();
        int mlen = m.length();
        // 记录每个字符的位置
        int []dp = new int[mlen];
        boolean flag = true;
        Map<Character,List<Integer>> map = new HashMap<>();
        // 判断 m 每个字符是否在n中出现
        dp[0] = n.indexOf(m.charAt(0));
        for (int i = 1; i< mlen;i++){
            if (n.indexOf(m.charAt(i)) == n.lastIndexOf(m.charAt(i))){
                // 字符不重复
                dp[i] = n.indexOf(m.charAt(i));
            } else {
                // 字符重复
                for (int j = 0;j<n.length();j++){
                    if (n.charAt(j) == m.charAt(i)){
                        // 当 字符位置为n.length时，代表存在重复值
                        dp[i] = n.length();
                        List<Integer> list = map.getOrDefault(n.charAt(i),new ArrayList<>());
                        list.add(j);
                        map.put(n.charAt(i),list);
                    }
                }
            }

        }
        int count = 0;
        for (int i=1;i<mlen;i++){
            // 不需要循环
            if (dp[i] == -1){
                flag = false;
                break;
            }
            // i 和 i-1 均不是重复值 i > i-1
            if (dp[i] > dp[i-1] && dp[i] < nlen && dp[i-1] < nlen ){
                continue;
            }else if (dp[i] == nlen && dp[i-1] < nlen){
                // i是重复值 i > i-1
                List<Integer>list = map.get(m.charAt(i));
                for (int x = 0 ; x<list.size();x++ ){
                    if (list.get(x) > dp[i-1]){
                        // 记录这次的位置
                        dp[i] = list.get(x);
                        break;
                    }
                }
                if (dp[i] == nlen){
                    // 循环
                    count++;
                    // 位置就可以为下一个循环的第一个
                    dp[i] = list.get(0);
                }
            }else if (dp[i] < dp[i-1]){
                count++;
            }
        }
        if (!flag){
            System.out.println("-1");
        }else{
            System.out.println(count * n.length() + n.indexOf(m.charAt(mlen-1))  - (mlen - 1));
        }
    }
}
