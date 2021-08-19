package leetcode.test;

import java.util.Arrays;
import java.util.Scanner;

public class minCount {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [] task = new int[m];
        for (int i=0;i<m;i++){
            task[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        if (n < m ){
            System.out.println("CPU调用次数小于队列数");
            return;
        }
        Arrays.sort(task);
        int l = 0,r = task[m-1],x = task[m-1];
        int count = 0;
        while(l <= r){
            int mid = (l+r) / 2;
            for (int t : task){
                count += (int)Math.ceil((double)t/mid);
            }
            // 次数小于CPU调用次数，说明x过大。
            if (count < n){
                r = mid - 1;
            }else if (count > n){
                // 次数大于CPU调用次数，说明x过小
                l = mid + 1;
            }else {
                //等于说明 x可能过大。
                r = mid - 1;
                x = mid;
            }
            count = 0;
        }
        System.out.println(x);
    }
}
