package leetcode.test;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapTest {
    private Integer age;

    public TreemapTest(Integer age){
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[]args){
//        TreeMap<TreemapTest,String> treeMap = new TreeMap(new Comparator<TreemapTest>() {
//            @Override
//            public int compare(TreemapTest o1, TreemapTest o2) {
//                int num = o1.getAge() - o2.getAge();
//                return Integer.compare(num,0);
//            }
//        });
        //将代码替换成 Lambda 表达式实现的方式：
        TreeMap<TreemapTest,String> treeMap = new TreeMap<>((o1,o2) -> {
            int num = o1.getAge() - o2.getAge();
            return Integer.compare(num, 0);
        });

        treeMap.put(new TreemapTest(3), "person1");
        treeMap.put(new TreemapTest(18), "person2");
        treeMap.put(new TreemapTest(35), "person3");
        treeMap.put(new TreemapTest(16), "person4");
        treeMap.entrySet().stream().forEach(a -> {
            System.out.println(a.getKey() + ":" + a.getValue());
        });

    }
}
