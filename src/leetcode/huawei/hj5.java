package leetcode.huawei;

import java.util.Scanner;

public class hj5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(Integer.valueOf(s.substring(2),16).toString());
            int len = s.length();
            int res = 0;
            for (int i = len-1;i>1;i--){
                switch (Character.toLowerCase(s.charAt(i))){
                    case 'a':
                        res += Math.pow(16,len-i-1)*10;
                        break;
                    case 'b':
                        res += Math.pow(16,len-i-1)*11;
                        break;
                    case 'c':
                        res += Math.pow(16,len-i-1)*12;
                        break;
                    case 'd':
                        res += Math.pow(16,len-i-1)*13;
                        break;
                    case 'e':
                        res += Math.pow(16,len-i-1)*14;
                        break;
                    case 'f':
                        res += Math.pow(16,len-i-1)*15;
                        break;
                    default:
                        res +=  Math.pow(16,len-i-1)*(s.charAt(i)-'0');
                        break;
                }
            }
            System.out.println(res);
        }
    }
}
