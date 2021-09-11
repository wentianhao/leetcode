package leetcode.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hj9 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        Set<Character>set = new HashSet<>();
        for (int i = len-1;i>=0;i--){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                System.out.print(s.charAt(i) - '0');
            }
        }
    }
}
