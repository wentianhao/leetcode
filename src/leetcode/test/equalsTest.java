package leetcode.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class equalsTest {

    public static final String c = "123";
    public static final String d = "456";

    public static final String s1 ;
    public static final String s2 ;

    static {
        s1 = "123";
        s2 = "456";
    }


    public static int sum(int a,int b){
        return a + b;
    }

    public void test(){
        equalsTest t  = new equalsTest();
        System.out.println("-------");
        System.out.println(t.sum(1,2));
        System.out.println(equalsTest.sum(1,2));
    }

    public static void main(String[]args){
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab");  // b为另一个引用，对象的内容一样

        StringBuilder sb = new StringBuilder();
        StringBuilder sa = new StringBuilder();

        String aa = "ab"; //放在常量池中
        String bb = "ab"; //从常量池查找
        for (int i=0;i<5;i++){
            aa += String.valueOf(i);
            bb += String.valueOf(i);
//            sb.append(String.valueOf(i));
//            sa.append(String.valueOf(i));
        }

//        aa = sa.toString();
//        bb = sa.toString();
        Integer aaa = 127;
        Integer bbb = 127;
        System.out.println("aa:" + aa);
        System.out.println(bb);
        if (aa == bb) // true
            System.out.println("aa==bb");
        if (aa.equals(bb))
            System.out.println("q");
        if (a==b)   //false,非同一对象
            System.out.println("a==b");
        if (a.equals(b))    // true
            System.out.println("aEQb");
        if (42 == 42.0) //true
            System.out.println("true");
        if (aaa==bbb)
            System.out.println("aaa==bbb");


        System.out.println("-----------------------------------");

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hel" + "lo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        String s10 = new String("hello");

        System.out.println(s1==s2);   // true
        System.out.println(s1==s3);   // true
        System.out.println(s1==s4);   // false
        System.out.println(s1==s6);   // true
        System.out.println(s1==s9);   // false
        System.out.println(s4==s5);   // false
        System.out.println(s10==s5);   // false
        System.out.println(s9==s5);    // false
        Integer.valueOf(1);
        String.valueOf(1);
        System.out.println("----final ");
        String f = "123456";
        System.out.println(c+d == f);
        String s = s1 + s2;
        System.out.println(f == s);

        System.out.println("--------------------Integer------------------");
        Integer x = 127;
        Integer y = 127;

        Integer x1 = 128;
        Integer x2 = 128;

        Integer x3 = new Integer(127);
        Integer x4 = new Integer(127);

        System.out.println(x == y); // true
        System.out.println(x1 == x2); // false
        System.out.println(x3 == x4); // false
        System.out.println(x == x3); // false

        Double m = 1.0;
        Double n = 1.0;
        System.out.println(m == n); // false

        equalsTest test = new equalsTest();
        System.out.println(test.sum(1,2));
        System.out.println("--------------");
        test.test();

        System.out.println("-------------float---------------");
        float f1 = 1.0f - 0.9f;
        float f2 = 0.9f - 0.8f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1 == f2);

        BigDecimal bg1 = new BigDecimal("1.0");
        System.out.println(bg1);

        BigDecimal bg2 = new BigDecimal("0.9");
        System.out.println(bg2);

        BigDecimal bg3 = new BigDecimal("0.8");
        System.out.println(bg3);


        BigDecimal bg4 = bg1.subtract(bg2);
        BigDecimal bg5 = bg2.subtract(bg3);
        System.out.println(bg4);
        System.out.println(bg5);
        System.out.println(bg4.equals(bg5));
        System.out.println("------------foreach----------------");

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String str = iterator.next();
//            if ("1".equals(str)){
//                iterator.remove();
//            }
//        }
        for (String s11 : list){
            if ("3".equals(s11)){
                System.out.println("s"+s11);
                list.remove(s11);
            }
        }
        System.out.println(list.size());
        System.out.println(list);
    }

}
