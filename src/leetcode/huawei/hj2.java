package leetcode.huawei;

import java.util.Scanner;

public class hj2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String x = scanner.nextLine();
        char c = x.charAt(0);
        int len = s.length();
        int res = 0;
        for(int i=0;i<len;i++){
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)){
                res++;
            }
        }
        System.out.println(res);
    }
}
