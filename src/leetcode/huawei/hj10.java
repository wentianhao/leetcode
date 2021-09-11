package leetcode.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hj10 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        int res = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0;i<len;i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                res++;
            }
        }
        System.out.println(res);
    }
}
