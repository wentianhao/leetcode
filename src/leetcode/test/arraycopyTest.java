package leetcode.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraycopyTest {
    public static void main(String []args){
        int []a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        System.arraycopy(a,2,a,3,3);
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println("--------------------");
        a[2] = 20;
        for (int i : a){
            System.out.print(i + " ");
        }

        System.out.println("----------------");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
//        for (String s : list){
//            if (s.equals("c")){
//                list.remove(s);
//            }
//        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if (s.equals("c")){
                iterator.remove();
            }
        }
    }
}
