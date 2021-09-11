package leetcode.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class hj3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            TreeSet<Integer>set = new TreeSet<>();
            int n = scanner.nextInt();
            for (int i=0;i<n;i++){
                set.add(scanner.nextInt());
            }
            Iterator iterator = set.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

    }
}
