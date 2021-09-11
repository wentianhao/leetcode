package leetcode.huawei;

import java.util.Scanner;

public class hj1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String []ss = s.split(" ");
        System.out.println(ss[ss.length-1].length());
    }
}
