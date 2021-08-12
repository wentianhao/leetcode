package leetcode.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[]args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组");
        System.out.println(arrayList);

        // 反转
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse 反转数组");
        System.out.println(arrayList);

        // 升序排序
        Collections.sort(arrayList);
        System.out.println("Collections.sort  升序");
        System.out.println(arrayList);

        // 定制排序
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后");
        System.out.println(arrayList);
    }
}
