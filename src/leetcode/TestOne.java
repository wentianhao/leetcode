package leetcode;

import java.util.Random;

public class TestOne {
    private static int x = 100;
    public static void main(String args[]){
//        TestOne hs1 = new TestOne();
//        hs1.x++;
//        TestOne hs2 = new TestOne();
//        hs2.x++;
//        hs1 = new TestOne();
//        hs1.x++;
//        TestOne.x--;
//        System.out.println("x="+x);
        Random random = new Random();
        //该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n。
        System.out.println(random.nextInt(2));
        System.out.println(random.nextInt(2));
        System.out.println(random.nextInt(2));
        System.out.println(random.nextInt(2));

    }
}
