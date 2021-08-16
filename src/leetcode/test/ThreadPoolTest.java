package leetcode.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    // 核心线程数 ： 最下可运行的线程数量
    private static final int CORE_POOL_SIZE  = 5;
    // 最大线程数
    private static final int MAX_POOL_SIZE = 10;
    // 队列容量
    private static final int QUEUE_CAPACITY = 100;
    // 存活时间
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[]args){

        // 使用阿里巴巴推荐的创建线程池的方法
        // 通过ThreadPoolExecutor构造函数 自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i=0;i<10;i++) {
            // 创建WorkerThread对象(WorkerThread类实现了Runnable接口)
            Runnable worker = new MyRunnable(" " + i);
            // 执行Runnable
            executor.execute(worker);
        }

        //终止线程池
        executor.shutdown();
        while (!executor.isTerminated()){
        }
        System.out.println("Finished all threads");
    }
}
