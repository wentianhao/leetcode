package leetcode.huawei;

import java.util.Scanner;

public class hj4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int len = s.length();
            int idx = len;
            int i = 0;
            int j = Math.min(idx,8);
            String temp;
            while (len > 8){
                temp = s.substring(i,j);
                System.out.println(temp);
                len = len - 8;
                i = j;
                j = Math.min(idx,j+8);
            }
            int l = j - i;
            temp = s.substring(i,j);
            while (l<8){
                temp = temp + "0";
                l++;
            }
            System.out.println(temp);
        }
    }
}
