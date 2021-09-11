package leetcode.huawei;

import java.util.*;

public class hj8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer,Integer>map = new TreeMap<>();
        for (int i=0;i<n;i++){
            String l = scanner.nextLine();
            String []ls = l.split(" ");
            int x = Integer.parseInt(ls[0]);
            int y = Integer.parseInt(ls[1]);
            map.put(x,map.getOrDefault(x,0)+y);
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
