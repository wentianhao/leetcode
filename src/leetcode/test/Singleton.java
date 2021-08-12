package leetcode.test;

public class Singleton {
    // 单例模式的双重校验
    private volatile static Singleton uniqueInstance;

    private Singleton (){
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null){
            // 静态变量锁的是class对象
            synchronized (Singleton.class) {
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
