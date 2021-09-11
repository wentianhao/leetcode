package leetcode.huawei;

import java.util.Scanner;

public class hj6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = Long.parseLong(s);
        getN(n);
    }

    public static void getN(long n){
        long k = (long) Math.sqrt(n);
        for (long i = 2;i<=k;i++){
            while (n % i == 0){
                System.out.print(i + " ");
                n /=  i;
            }
        }
        System.out.print(n == 1?"":n + " ");
    }
}
