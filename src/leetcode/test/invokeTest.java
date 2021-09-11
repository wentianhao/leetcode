package leetcode.test;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class invokeTest {
    public static void main(String[]args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {


        // 获取Class对象四种方式
        // 1. 知道具体类
        Class class1 = TargetObject.class;
        System.out.println(class1);
        // 2.Class.forName传入类路径
        // 获取TargetObject类的class对象并创建TargetObject类实例
        Class<?> targetClass = Class.forName("leetcode.test.TargetObject");
        System.out.println(targetClass);
        // 3.通过对象实例 instance.getClass()获取
        TargetObject o = new TargetObject();
        Class class2 = o.getClass();
        System.out.println(class2);
        // 4.类加载器传入类路径
        Class class3 = ClassLoader.getSystemClassLoader().loadClass("leetcode.test.TargetObject");
        System.out.println(class3);
        // 创建类实例
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        // 获取类中所有方法
        Method[] methods = targetClass.getDeclaredMethods();
        System.out.println("输出所有方法");
        for (Method method : methods){
            System.out.println(method.getName());
        }

        // 获取指定方法并调用
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod",String.class);
        publicMethod.invoke(targetObject,"world");


        // 对于private
        Field field = targetClass.getDeclaredField("value");
        // 取消安全检查
        field.setAccessible(true);
        field.set(targetObject,"invoke");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        // 调用private 取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
