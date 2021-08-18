package leetcode.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CountDownLatchTest {
    /**
     * CountDownLatch：允许count个线程阻塞在同一个地方，直到所有线程都完成任务
     */

    // 处理文件的数量
    private static final int threadCount = 6;

    public static void main(String []args) throws InterruptedException {
        // 创建一个具有固定线程数量的线程池对象（推荐使用构造方法创建）
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i=0;i<threadCount;i++) {
            final int threadNum = i;
            threadPool.execute(()->{
                // 处理文件业务操作
                try{
                    System.out.println( threadNum + " 作业已完成");
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");

    }

}
