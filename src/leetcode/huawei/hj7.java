package leetcode.huawei;

import java.util.Scanner;

public class hj7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int index = s.indexOf(".");
        int x = s.charAt(index+1) - '0';
        int y = Integer.parseInt(s.substring(0,index));
        if (x >= 5){
            System.out.println(y+1);
        }else{
            System.out.println(y);
        }

    }
}
