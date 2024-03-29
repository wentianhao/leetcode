package leetcode.test;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalTest implements Runnable {

    /** SimpleDataFormat 不是线程安全的，所以每个线程都要有自己独立的副本
    */
    private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));

//    private static final ThreadLocal<SimpleDateFormat> formatter1 = new ThreadLocal<SimpleDateFormat>(){
////        @Override
////        protected SimpleDateFormat initialValue(){
////            return new SimpleDateFormat("yyyyMMdd HHmm");
////        }
////    };

    public static void main(String[]args) throws InterruptedException {
        ThreadLocalTest obj = new ThreadLocalTest();
        for (int i=0; i< 3; i++) {
            Thread t = new Thread(obj, " " + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("    Thread Name = " + Thread.currentThread().getName() + "  default Formatter = " + formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formatter.set(new SimpleDateFormat());

        System.out.println("    Thread Name= " + Thread.currentThread().getName() +  "  formatter = " +formatter.get().toPattern());
    }
}
